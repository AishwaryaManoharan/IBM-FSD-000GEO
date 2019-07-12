const TrainerService=()=>{
    let tname=document.getElementById('tname').value;
     let tSkills=document.getElementsByName('skill');
     
     let selectedtSkills="";
     for(var i=0; i<tSkills.length; i++){
         if(tSkills[i].checked==true){
             selectedtSkills+=tSkills[i].value+"\n";
             console.log(tSkills[i]);
             
         }
         localStorage.setItem(tname,selectedtSkills);
     }
    

const saveTrainer= () =>
    {
    console.log('Save Called');
    // create Trainer Service Object
    const tnr = new TrainerService();
    tnr.setup(
        document.getElementById('tname').value,
        document.getElementById('tmaths').value,
        document.getElementById('tphysics').value,
        document.getElementById('tbiology').value
        );
    // SAVE Employee*
    tnr._add();
    fetchAllTrainers();
    }

const fetchAllTrainers = ()=>
{
    //document.getElementById('eEmail').removeAttribute('readonly');
    const tnr = new TrainerService();
    const trainers = tnr._all();
    //buildTrainersTable(trainers);
    
}

class TrainerService 
{
    
    // setup method 
    setup(tname,tmaths,tphysics,tbiology){
            this.tname = tname
            this.tmaths = tmaths
            this.tphysics = tphysics
            this.tbiology = tbiology
    }

    _add()
    {
        localStorage.setItem(this.tName,JSON.stringify({
            
            tName: this.tName
            
        }));
    }

_all(){
    const employees = [];
    // fill up Array
    Object.keys(localStorage).forEach((storeKey)=>{
        employees.push(JSON.parse(localStorage.getItem(storeKey)));
    });
    return employees;
}
}}
