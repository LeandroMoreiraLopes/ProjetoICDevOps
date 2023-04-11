terraform {
    required_providers  {
        aws = {
            source = "hashicorp/aws"
            version = "~> 3.27"
        }
    }
    backend "http" {}

    # Configure and downloading pluing for aws
    provider "aws" {
        region      = "${var.aws_region}"
    }
}