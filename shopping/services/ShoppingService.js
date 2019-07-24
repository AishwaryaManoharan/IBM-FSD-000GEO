const products=require('../db/products').products;
const Email= require('.services/emailService').Email;
const setContentHeader = require('../services/utils').setContentHeader;
const utils= require('../services/utils').utils;
const email=new Email();
class Service
{
    constructor(){
        this.products=products;
    }
    _all(){
        return this.products;
    }

    searchProduct(pro){
        this.products=products;
        this.products.forEach((pro)=>{
            if(pro.id==pro.id){
                return p;
            }
        });
    }

    buy(user){
        let userObj ={
            subject : "User Registration",
            body : `<div>Dear Customer</div>
                    <div>Thanks for Shopping</div>`,
            from : null,
            to : user.email
        }
        email.email(userObj);
    }
}
module.exports={
    Service
}