const express=require('express');
const server=express();
const parser=require('body-parser');
const cors=require('cors');

server.use(parser.json());
server.use(cors());
// status 
server.get('/status',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(
        JSON.stringify({
            message : "Service is Running"
        }));
});

server.get('/display',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(
        JSON.stringify({
            message : "Display ready"
        }));
});

// Port Binding
const PORT = 1234;
server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});