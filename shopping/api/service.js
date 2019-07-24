const server = require('express').Router();
const PService = require('../api/service').service;
const projectService = new PService();
const setContentHeader = require('../db/products').setContentHeader;

server.get('/',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        projects : projectService._all()
    }));
});

server.post('/modify',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        projects : projectService.modify(req.body)
    }));
});

module.exports = {server};