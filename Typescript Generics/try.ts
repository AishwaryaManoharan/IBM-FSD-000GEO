//06.08.2019 Typescript generics
interface Vehicles
{
    id:number
    ename:string
}

interface Bike extends Vehicles
{
    name:string
}

interface Cars extends Vehicles
{
    name:string
    eid:number
}

const detail=
{
bike:
{
    name:'RoyalEnfield'
},
car:
{
    name:'Bayerische Motoren Werke',
    id:1
}
}

/*const vehicledetails=<t extends Vehicles>(z:t):t=>
{
    if(typeof z=='object')
        return z;
    return z;
}

let vDetails:Bike|Cars=vehicledetails<Bike>({
    id:11,
    ename:'B',
    name:detail.bike.name
});

vDetails=vehicledetails<Cars>({
    id:12,
    ename:'C',
    name:detail.car.name,
    eid:234
});*/

class Aish<X extends Vehicles,Y extends string[]>
{
    vehicle:X;
    origin:Y;
    
    constructor(vehicle:X,origin:Y)
    {
        this.vehicle=vehicle;
        this.origin=origin;
    }
    getVehicleInfo():X
    {
        return this.vehicle;
    }
    getCountryOfOrigin():Y
    {
        return this.origin;
    }
}

const bikevariable=new Aish<Bike,string[]>({id:1,ename:'RE',name:detail.bike.name},["India"]);
const carvariable=new Aish<Cars,string[]>({id:2,name:detail.car.name,ename:'BMW',eid:321},["Germany"]);

console.log(bikevariable.getVehicleInfo());
console.log(bikevariable.getCountryOfOrigin());

console.log(carvariable.getVehicleInfo());
console.log(carvariable.getCountryOfOrigin());