<template>
  <main>

    <section class="py-5 text-center container">
      <div class="row py-lg-5">
        <div class="col-lg-6 col-md-8 mx-auto">
          <h1 class="fw-light">호호홓</h1>
          <p class="lead text-body-secondary">제트래곤 빙천마 그레이셰도우</p>
          <p>
            <a href="#" class="btn btn-primary my-2">Main call to action</a>
            <a href="#" class="btn btn-secondary my-2">Secondary action</a>
          </p>
        </div>
      </div>
    </section>

    <div class="album py-5 bg-body-tertiary">
      <div class="container">

        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          <div class="col" v-for="i in 12" :key="i">
            <Card/>
          </div>
        </div>
      </div>
    </div>

  </main>
</template>

<script>
// import axios from "axios";
// import {reactive} from "vue";
import Card from "@/components/Card";
export default {
  name : "Home",
  components: {Card}
}

</script>

<style scoped></style>