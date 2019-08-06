var detail = {
    bike: {
        name: 'RoyalEnfield'
    },
    car: {
        name: 'Bayerische Motoren Werke',
        id: 1
    }
};
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
var Aish = /** @class */ (function () {
    function Aish(vehicle, origin) {
        this.vehicle = vehicle;
        this.origin = origin;
    }
    Aish.prototype.getVehicleInfo = function () {
        return this.vehicle;
    };
    Aish.prototype.getCountryOfOrigin = function () {
        return this.origin;
    };
    return Aish;
}());
var bikevariable = new Aish({ id: 1, ename: 'RE', name: detail.bike.name }, ["India"]);
var carvariable = new Aish({ id: 2, name: detail.car.name, ename: 'BMW', eid: 321 }, ["Germany"]);
console.log(bikevariable.getVehicleInfo());
console.log(bikevariable.getCountryOfOrigin());
console.log(carvariable.getVehicleInfo());
console.log(carvariable.getCountryOfOrigin());
