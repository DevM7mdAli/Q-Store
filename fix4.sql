ALTER TABLE cart
DROP CONSTRAINT totalcons;

ALTER TABLE cart
ADD CONSTRAINT totalcons CHECK(total >= 0.00);