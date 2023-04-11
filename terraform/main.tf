# Creating VPC
resource "aws_vpc" "demo_vpc"{
    cidr_block       = "${var.vpc_cidr}"
    instance_tenancy = "default"

    tags = {
        Name = "Demo-VPC"
    }
}