import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
import time

@pytest.fixture
def setup():
    driver = webdriver.Chrome()
    driver.maximize_window()
    yield driver
    driver.quit()

@pytest.mark.parametrize("search_query", ["Macbook air m2"])
def test_add_to_cart(setup, search_query):
    driver = setup
    driver.get("https://www.flipkart.com/")

    time.sleep(3) 
    first_item = driver.find_element(By.CLASS_NAME, "_30XB9F")
    first_item.click()

    # Verify Flipkart logo is present
    flipkart_logo = driver.find_element(By.CSS_SELECTOR, "img[title='Flipkart']")
    assert flipkart_logo.is_displayed()
    print("Flipkart is present on left side of the top")

    # Enter “Macbook air m2” in text box and search
    search_box = driver.find_element(By.NAME, "q")
    search_box.send_keys(search_query)
    search_box.submit()
    time.sleep(3)
    print("Macbook air m2 has been searched")

    # Click on the first displayed item
    first_product = driver.find_element(By.CLASS_NAME, "_4rR01T")
    first_product.click()
    time.sleep(3)
    print("Clicked on the first displayed item")

    driver.switch_to.window(driver.window_handles[1])
    
    # Click on the "Add To Cart" button
    add_to_cart_button = driver.find_element(By.CSS_SELECTOR, "button._2KpZ6l._2U9uOA._3v1-ww")
    add_to_cart_button.click()
    time.sleep(3)
    print("Clicked on Add To Cart button")

    if driver.find_element(By.CSS_SELECTOR, "div._2sKwjB").is_displayed():
        go_to_cart_button = driver.find_element(By.CSS_SELECTOR, "path._1bS9ic")
        go_to_cart_button.click()
        time.sleep(3)
    else:
        print("Product is now out of stock")

    # Verify that item has been added to the cart successfully
    cart_text = driver.find_element(By.CSS_SELECTOR, "div.nxl3SA").text
    assert "Price (1 item)" in cart_text
    print("Verified the item has been added to the cart successfully")

