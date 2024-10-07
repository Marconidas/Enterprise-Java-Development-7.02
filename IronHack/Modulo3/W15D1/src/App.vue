<script setup>
import NabvarComponent from './components/NabvarComponent.vue'
import FooterComponent from './components/FooterComponent.vue'
import { ref } from 'vue'
//import { reactive, computed } from 'vue';

const num = ref(0)
const boolean = ref(true)

function sumaReactiva() {
  const valor = num.value + num.value
  return valor
}
//console.log(sumaReactiva.value)
</script>

<template>
  <div id="principal">
    <h1>Week15D1</h1>
    <NabvarComponent></NabvarComponent>
    <p>Resultado de 2 + 2: {{ 2 + 2 }}</p>
    <br />
    <input name="num" id="num" v-model="num" type="number" />
    <p>{{ sumaReactiva() }}</p>
    <br />
    <p v-if="boolean">Ahora me ves</p>
    <FooterComponent></FooterComponent>
  </div>
</template>

<style scoped>
div {
  background-color: aqua;
}
</style>
