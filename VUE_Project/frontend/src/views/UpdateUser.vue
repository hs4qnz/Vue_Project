<template>
    <main>
        <Navbar/>
        <div class="my-5">
            <div class="mx-auto w-25 " style="max-width:100%;">
              <h2 class="text-center mb-3">Update User</h2>
              <form @submit.prevent="updateUser">
                <!--FirstName-->
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="firstName" class="form-label">FirstName</label>
                    <input id="firstName"  type="text" name="firstName" class="form-control" placeholder="FirstName" required v-model="user.firstName">
                  </div>
                </div>

                
                <!--LastName-->
                <div class="row">
                    <div class="col-md-12 form-group mb-3">
                      <label for="lastName" class="form-label">LastName</label>
                      <input id="lastName" type="text"  name="lastName" class="form-control" placeholder="LastName" required v-model="user.lastName" >
                    </div>
                  </div>

                <!--Phone Number-->
                <div class="row">
                    <div class="col-md-12 form-group mb-3">
                      <label for="pNo" class="form-label">Phone Number</label>
                      <input id="pNo" type="text"  name="pNo" class="form-control" placeholder="Phone Number" required v-model="user.pNo" >
                    </div>
                  </div>             
                
                <!--Gender-->
                <label for="gender" class="form-label">Gender</label>
                <div class="form-check">
                  <input class="form-check-input"   type="radio" name="gender" id="male" value="male" v-model="user.gender">
                  <label class="form-check-label" for="male">Male</label>
                </div>
                <div class="form-check">
                  <input class="form-check-input" type="radio"   name="gender" id="female" value="female" v-model="user.gender">
                  <label class="form-check-label" for="female">Female</label>
                </div>
                <div class="form-check">
                  <input class="form-check-input" type="radio"   name="gender" id="others" checked value="others" v-model="user.gender">
                  <label class="form-check-label" for="others">Others</label>
                </div>  
               
                <div class="row">
                  <div class="col-md-12 form-group">
                    <input class="btn btn-primary w-100" type="submit" value="Submit">
                  </div>
                </div>
      
                <div>
                  
                </div>
              </form>
        
            </div>
          </div>

    </main>
</template>


<script>
import Navbar from '../components/Navbar.vue';

export default {
    name: 'UpdateUser',
    components: {
        Navbar
    },

    data(){
        return {
            user: {
                id: '',
                firstName: '',
                lastName: '',
                gender: '',
                pNo: '',
                birthdate: ''
            }
        }
    },

    beforeMount(){
        this.getUsers();
    },

    methods: {
        getUsers(){
            fetch(`http://localhost:8080/user/${this.$route.params.id}`)
            .then(res => res.json())
            .then(data => {
                this.user = data;
                console.log(this.user);
            })

        },
        updateUser(){
            fetch(`http://localhost:8080/user`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(this.user)
            })
            .then(data => {
                console.log(data);
                this.$router.push('/');
            })
        }
    }
}

</script>