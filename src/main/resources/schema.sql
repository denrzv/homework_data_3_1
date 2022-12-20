CREATE TABLE CUSTOMERS (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(100),
                           surname VARCHAR(100),
                           age INT,
                           phone_number INT
);

CREATE INDEX idx_customers_name
    ON CUSTOMERS(name);

CREATE TABLE ORDERS (
                        id SERIAL PRIMARY KEY,
                        date TIMESTAMP DEFAULT NOW(),
                        customer_id INT,
                        product_name VARCHAR(100),
                        amount INT,
                        CONSTRAINT fk_customer
                            FOREIGN KEY(customer_id)
                                REFERENCES CUSTOMERS(id)
);

CREATE INDEX idx_orders_customer_id
    ON ORDERS(customer_id);