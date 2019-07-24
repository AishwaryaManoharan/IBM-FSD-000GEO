const projects = require('../db/projects').projects;
class ShoppingService{
    constructor(){
        this.projects = projects;
    }
    _all(){
        return this.projects;
    }
    _add(project){
        this.projects.push(project);
        return this.projects;
    }
}

module.exports.ShoppingService = ShoppingService;