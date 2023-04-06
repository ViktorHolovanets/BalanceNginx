<template>
  <div>
    <SelectComponent :options="store.mark" :title="'Mark'" :callback="store.getModel"/>
    <SelectComponent :options="store.model" :title="'Model'" :callback="store.getGeneration"/>
    <SelectComponent :options="store.generation" :title="'Generation'" :callback="store.getConfiguration"/>
    <SelectComponent :options="store.configuration" :title="'Configuration'" :callback="store.getModification"/>
    <SelectComponent :options="store.modification" :title="'Modification'" :callback="mark"/>
  </div>
</template>

<script>
import SelectComponent from "@/components/cars/SelectComponent.vue";
import {carStore} from "@/stores/carStore"
export default {
  name: "CarsView",
  components: {SelectComponent},
  methods: {
    mark(id) {
      console.log(id);
    },
  },
  mounted() {
    this.store.getMark();
  },
  data() {
    return {
      store:carStore(),
      marks: [
        {
          "name": "AC",
          "id": "AC"
        },
        {
          "name": "Acura",
          "id": "ACURA"
        },
        {
          "name": "Adler",
          "id": "ADLER"
        },
        {
          "name": "GAC Aion",
          "id": "AION"
        },
        {
          "name": "Alfa Romeo",
          "id": "ALFA_ROMEO"
        },
        {
          "name": "Alpina",
          "id": "ALPINA"
        },
        {
          "name": "Alpine",
          "id": "ALPINE"
        },
        {
          "name": "AMC",
          "id": "AMC"
        },
        {
          "name": "AM General",
          "id": "AM_GENERAL"
        },
        {
          "name": "Apal",
          "id": "APAL"
        },
        {
          "name": "Arcfox",
          "id": "ARCFOX"
        },
        {
          "name": "Ariel",
          "id": "ARIEL"
        },
        {
          "name": "Aro",
          "id": "ARO"
        },
        {
          "name": "Asia",
          "id": "ASIA"
        },
        {
          "name": "Aston Martin",
          "id": "ASTON_MARTIN"
        },
        {
          "name": "Auburn",
          "id": "AUBURN"
        },
        {
          "name": "Audi",
          "id": "AUDI"
        },
        {
          "name": "Aurus",
          "id": "AURUS"
        },
        {
          "name": "Austin",
          "id": "AUSTIN"
        },
        {
          "name": "Austin Healey",
          "id": "AUSTIN_HEALEY"
        },
        {
          "name": "Autobianchi",
          "id": "AUTOBIANCHI"
        },
        {
          "name": "Автокам",
          "id": "AVTOKAM"
        },
        {
          "name": "BAIC",
          "id": "BAIC"
        },
        {
          "name": "Bajaj",
          "id": "BAJAJ"
        },
        {
          "name": "Baltijas Dzips",
          "id": "BALTIJAS_DZIPS"
        },
        {
          "name": "Batmobile",
          "id": "BATMOBILE"
        },
        {
          "name": "Bentley",
          "id": "BENTLEY"
        },
        {
          "name": "Bertone",
          "id": "BERTONE"
        },
        {
          "name": "Bilenkin",
          "id": "BILENKIN"
        },
        {
          "name": "Bio auto",
          "id": "BIO_AUTO"
        },
        {
          "name": "Bitter",
          "id": "BITTER"
        },
        {
          "name": "Blaval",
          "id": "BLAVAL"
        },
        {
          "name": "BMW",
          "id": "BMW"
        },
        {
          "name": "Borgward",
          "id": "BORGWARD"
        },
        {
          "name": "Brabus",
          "id": "BRABUS"
        },
        {
          "name": "Brilliance",
          "id": "BRILLIANCE"
        },
        {
          "name": "Bristol",
          "id": "BRISTOL"
        },
        {
          "name": "Bufori",
          "id": "BUFORI"
        },
        {
          "name": "Bugatti",
          "id": "BUGATTI"
        },
        {
          "name": "Buick",
          "id": "BUICK"
        },
        {
          "name": "BYD",
          "id": "BYD"
        },
        {
          "name": "Byvin",
          "id": "BYVIN"
        },
        {
          "name": "Cadillac",
          "id": "CADILLAC"
        },
        {
          "name": "Callaway",
          "id": "CALLAWAY"
        },
        {
          "name": "Carbodies",
          "id": "CARBODIES"
        },
        {
          "name": "Caterham",
          "id": "CATERHAM"
        },
        {
          "name": "Chana",
          "id": "CHANA"
        },
        {
          "name": "Changan",
          "id": "CHANGAN"
        },
        {
          "name": "ChangFeng",
          "id": "CHANGFENG"
        },
        {
          "name": "Changhe",
          "id": "CHANGHE"
        },
        {
          "name": "Chery",
          "id": "CHERY"
        },
        {
          "name": "EXEED",
          "id": "CHERYEXEED"
        },
        {
          "name": "Chevrolet",
          "id": "CHEVROLET"
        },
        {
          "name": "Chrysler",
          "id": "CHRYSLER"
        },
        {
          "name": "Ciimo (DongFeng-Honda)",
          "id": "CIIMO"
        },
        {
          "name": "Citroen",
          "id": "CITROEN"
        },
        {
          "name": "Cizeta",
          "id": "CIZETA"
        },
        {
          "name": "Coggiola",
          "id": "COGGIOLA"
        },
        {
          "name": "Cord",
          "id": "CORD"
        },
        {
          "name": "Cupra",
          "id": "CUPRA"
        },
        {
          "name": "Dacia",
          "id": "DACIA"
        },
        {
          "name": "Dadi",
          "id": "DADI"
        },
        {
          "name": "Daewoo",
          "id": "DAEWOO"
        },
        {
          "name": "Daihatsu",
          "id": "DAIHATSU"
        },
        {
          "name": "Daimler",
          "id": "DAIMLER"
        },
        {
          "name": "Dallara",
          "id": "DALLARA"
        },
        {
          "name": "Datsun",
          "id": "DATSUN"
        },
        {
          "name": "Deco Rides",
          "id": "DECO_RIDES"
        },
        {
          "name": "Delage",
          "id": "DELAGE"
        },
        {
          "name": "DeLorean",
          "id": "DELOREAN"
        },
        {
          "name": "Denza",
          "id": "DENZA"
        },
        {
          "name": "Derways",
          "id": "DERWAYS"
        },
        {
          "name": "DeSoto",
          "id": "DESOTO"
        },
        {
          "name": "De Tomaso",
          "id": "DE_TOMASO"
        },
        {
          "name": "DKW",
          "id": "DKW"
        },
        {
          "name": "Dodge",
          "id": "DODGE"
        },
        {
          "name": "DongFeng",
          "id": "DONGFENG"
        },
        {
          "name": "Doninvest",
          "id": "DONINVEST"
        },
        {
          "name": "Donkervoort",
          "id": "DONKERVOORT"
        },
        {
          "name": "DS",
          "id": "DS"
        },
        {
          "name": "DW Hower",
          "id": "DW_HOWER"
        },
        {
          "name": "Eagle",
          "id": "EAGLE"
        },
        {
          "name": "Eagle Cars",
          "id": "EAGLE_CARS"
        },
        {
          "name": "Everus",
          "id": "EVERUS"
        },
        {
          "name": "Excalibur",
          "id": "EXCALIBUR"
        },
        {
          "name": "E-Car",
          "id": "E_CAR"
        },
        {
          "name": "Ё-мобиль",
          "id": "E_MOBIL"
        },
        {
          "name": "Facel Vega",
          "id": "FACEL_VEGA"
        },
        {
          "name": "FAW",
          "id": "FAW"
        },
        {
          "name": "Ferrari",
          "id": "FERRARI"
        },
        {
          "name": "Fiat",
          "id": "FIAT"
        },
        {
          "name": "Fisker",
          "id": "FISKER"
        },
        {
          "name": "Flanker",
          "id": "FLANKER"
        },
        {
          "name": "Ford",
          "id": "FORD"
        },
        {
          "name": "Foton",
          "id": "FOTON"
        },
        {
          "name": "FSO",
          "id": "FSO"
        },
        {
          "name": "Fuqi",
          "id": "FUQI"
        },
        {
          "name": "GAC",
          "id": "GAC"
        },
        {
          "name": "ГАЗ",
          "id": "GAZ"
        },
        {
          "name": "Geely",
          "id": "GEELY"
        },
        {
          "name": "Genesis",
          "id": "GENESIS"
        },
        {
          "name": "Geo",
          "id": "GEO"
        },
        {
          "name": "GMC",
          "id": "GMC"
        },
        {
          "name": "Goggomobil",
          "id": "GOGGOMOBIL"
        },
        {
          "name": "Gonow",
          "id": "GONOW"
        },
        {
          "name": "Gordon",
          "id": "GORDON"
        },
        {
          "name": "GP",
          "id": "GP"
        },
        {
          "name": "Great Wall",
          "id": "GREAT_WALL"
        },
        {
          "name": "Hafei",
          "id": "HAFEI"
        },
        {
          "name": "Haima",
          "id": "HAIMA"
        },
        {
          "name": "Hanomag",
          "id": "HANOMAG"
        },
        {
          "name": "Haval",
          "id": "HAVAL"
        },
        {
          "name": "Hawtai",
          "id": "HAWTAI"
        },
        {
          "name": "Heinkel",
          "id": "HEINKEL"
        },
        {
          "name": "Hennessey",
          "id": "HENNESSEY"
        },
        {
          "name": "Hindustan",
          "id": "HINDUSTAN"
        },
        {
          "name": "Hispano-Suiza",
          "id": "HISPANO_SUIZA"
        },
        {
          "name": "Holden",
          "id": "HOLDEN"
        },
        {
          "name": "Honda",
          "id": "HONDA"
        },
        {
          "name": "Hongqi",
          "id": "HONGQI"
        },
        {
          "name": "Horch",
          "id": "HORCH"
        },
        {
          "name": "Hozon",
          "id": "HOZON"
        },
        {
          "name": "HSV",
          "id": "HSV"
        },
        {
          "name": "HuangHai",
          "id": "HUANGHAI"
        },
        {
          "name": "Hudson",
          "id": "HUDSON"
        },
        {
          "name": "Hummer",
          "id": "HUMMER"
        },
        {
          "name": "Hyundai",
          "id": "HYUNDAI"
        },
        {
          "name": "ИЖ",
          "id": "IG"
        },
        {
          "name": "Infiniti",
          "id": "INFINITI"
        },
        {
          "name": "Innocenti",
          "id": "INNOCENTI"
        },
        {
          "name": "International",
          "id": "INTERNATIONAL"
        },
        {
          "name": "Invicta",
          "id": "INVICTA"
        },
        {
          "name": "Iran Khodro",
          "id": "IRAN_KHODRO"
        },
        {
          "name": "Isdera",
          "id": "ISDERA"
        },
        {
          "name": "Isuzu",
          "id": "ISUZU"
        },
        {
          "name": "IVECO",
          "id": "IVECO"
        },
        {
          "name": "JAC",
          "id": "JAC"
        },
        {
          "name": "Jaguar",
          "id": "JAGUAR"
        },
        {
          "name": "Jeep",
          "id": "JEEP"
        },
        {
          "name": "Jensen",
          "id": "JENSEN"
        },
        {
          "name": "Jinbei",
          "id": "JINBEI"
        },
        {
          "name": "JMC",
          "id": "JMC"
        },
        {
          "name": "Канонир",
          "id": "KANONIR"
        },
        {
          "name": "Kia",
          "id": "KIA"
        },
        {
          "name": "Koenigsegg",
          "id": "KOENIGSEGG"
        },
        {
          "name": "Комбат",
          "id": "KOMBAT"
        },
        {
          "name": "KTM AG",
          "id": "KTM"
        },
        {
          "name": "Lamborghini",
          "id": "LAMBORGHINI"
        },
        {
          "name": "Lancia",
          "id": "LANCIA"
        },
        {
          "name": "Landwind",
          "id": "LANDWIND"
        },
        {
          "name": "Land Rover",
          "id": "LAND_ROVER"
        },
        {
          "name": "Leapmotor",
          "id": "LEAPMOTOR"
        },
        {
          "name": "Lexus",
          "id": "LEXUS"
        },
        {
          "name": "Liebao Motor",
          "id": "LIEBAO"
        },
        {
          "name": "Lifan",
          "id": "LIFAN"
        },
        {
          "name": "Ligier",
          "id": "LIGIER"
        },
        {
          "name": "Lincoln",
          "id": "LINCOLN"
        },
        {
          "name": "LiXiang",
          "id": "LIXIANG"
        },
        {
          "name": "Logem",
          "id": "LOGEM"
        },
        {
          "name": "Lotus",
          "id": "LOTUS"
        },
        {
          "name": "LTI",
          "id": "LTI"
        },
        {
          "name": "ЛуАЗ",
          "id": "LUAZ"
        },
        {
          "name": "Lucid",
          "id": "LUCID"
        },
        {
          "name": "Luxgen",
          "id": "LUXGEN"
        },
        {
          "name": "Mahindra",
          "id": "MAHINDRA"
        },
        {
          "name": "Marcos",
          "id": "MARCOS"
        },
        {
          "name": "Marlin",
          "id": "MARLIN"
        },
        {
          "name": "Marussia",
          "id": "MARUSSIA"
        },
        {
          "name": "Maruti",
          "id": "MARUTI"
        },
        {
          "name": "Maserati",
          "id": "MASERATI"
        },
        {
          "name": "Matra",
          "id": "MATRA"
        },
        {
          "name": "Maybach",
          "id": "MAYBACH"
        },
        {
          "name": "Mazda",
          "id": "MAZDA"
        },
        {
          "name": "McLaren",
          "id": "MCLAREN"
        },
        {
          "name": "Mega",
          "id": "MEGA"
        },
        {
          "name": "Mercedes-Benz",
          "id": "MERCEDES"
        },
        {
          "name": "Mercury",
          "id": "MERCURY"
        },
        {
          "name": "Messerschmitt",
          "id": "MESSERSCHMITT"
        },
        {
          "name": "Metrocab",
          "id": "METROCAB"
        },
        {
          "name": "MG",
          "id": "MG"
        },
        {
          "name": "Microcar",
          "id": "MICROCAR"
        },
        {
          "name": "Minelli",
          "id": "MINELLI"
        },
        {
          "name": "MINI",
          "id": "MINI"
        },
        {
          "name": "Mitsubishi",
          "id": "MITSUBISHI"
        },
        {
          "name": "Mitsuoka",
          "id": "MITSUOKA"
        },
        {
          "name": "Morgan",
          "id": "MORGAN"
        },
        {
          "name": "Morris",
          "id": "MORRIS"
        },
        {
          "name": "Москвич",
          "id": "MOSCVICH"
        },
        {
          "name": "Nash",
          "id": "NASH"
        },
        {
          "name": "Nio",
          "id": "NIO"
        },
        {
          "name": "Nissan",
          "id": "NISSAN"
        },
        {
          "name": "Noble",
          "id": "NOBLE"
        },
        {
          "name": "Oldsmobile",
          "id": "OLDSMOBILE"
        },
        {
          "name": "Opel",
          "id": "OPEL"
        },
        {
          "name": "Osca",
          "id": "OSCA"
        },
        {
          "name": "Packard",
          "id": "PACKARD"
        },
        {
          "name": "Pagani",
          "id": "PAGANI"
        },
        {
          "name": "Panoz",
          "id": "PANOZ"
        },
        {
          "name": "Perodua",
          "id": "PERODUA"
        },
        {
          "name": "Peugeot",
          "id": "PEUGEOT"
        },
        {
          "name": "PGO",
          "id": "PGO"
        },
        {
          "name": "Piaggio",
          "id": "PIAGGIO"
        },
        {
          "name": "Pierce-Arrow",
          "id": "PIERCE_ARROW"
        },
        {
          "name": "Plymouth",
          "id": "PLYMOUTH"
        },
        {
          "name": "Polestar",
          "id": "POLESTAR"
        },
        {
          "name": "Pontiac",
          "id": "PONTIAC"
        },
        {
          "name": "Porsche",
          "id": "PORSCHE"
        },
        {
          "name": "Premier",
          "id": "PREMIER"
        },
        {
          "name": "Спортивные авто и Реплики",
          "id": "PROMO_AUTO"
        },
        {
          "name": "Proton",
          "id": "PROTON"
        },
        {
          "name": "PUCH",
          "id": "PUCH"
        },
        {
          "name": "Puma",
          "id": "PUMA"
        },
        {
          "name": "Qoros",
          "id": "QOROS"
        },
        {
          "name": "Qvale",
          "id": "QVALE"
        },
        {
          "name": "RAM",
          "id": "RAM"
        },
        {
          "name": "Ravon",
          "id": "RAVON"
        },
        {
          "name": "Reliant",
          "id": "RELIANT"
        },
        {
          "name": "Renaissance",
          "id": "RENAISSANCE_CARS"
        },
        {
          "name": "Renault",
          "id": "RENAULT"
        },
        {
          "name": "Rezvani",
          "id": "REZVANI"
        },
        {
          "name": "Rimac",
          "id": "RIMAC"
        },
        {
          "name": "Rinspeed",
          "id": "RINSPEED"
        },
        {
          "name": "Rivian",
          "id": "RIVIAN"
        },
        {
          "name": "Roewe",
          "id": "ROEWE"
        },
        {
          "name": "Rolls-Royce",
          "id": "ROLLS_ROYCE"
        },
        {
          "name": "Ronart",
          "id": "RONART"
        },
        {
          "name": "Rover",
          "id": "ROVER"
        },
        {
          "name": "Saab",
          "id": "SAAB"
        },
        {
          "name": "Saipa",
          "id": "SAIPA"
        },
        {
          "name": "Saleen",
          "id": "SALEEN"
        },
        {
          "name": "Renault Samsung",
          "id": "SAMSUNG"
        },
        {
          "name": "Santana",
          "id": "SANTANA"
        },
        {
          "name": "Saturn",
          "id": "SATURN"
        },
        {
          "name": "Scion",
          "id": "SCION"
        },
        {
          "name": "Sears",
          "id": "SEARS"
        },
        {
          "name": "SEAT",
          "id": "SEAT"
        },
        {
          "name": "Shanghai Maple",
          "id": "SHANGHAI_MAPLE"
        },
        {
          "name": "ShuangHuan",
          "id": "SHUANGHUAN"
        },
        {
          "name": "Simca",
          "id": "SIMCA"
        },
        {
          "name": "Skoda",
          "id": "SKODA"
        },
        {
          "name": "Skywell",
          "id": "SKYWELL"
        },
        {
          "name": "Smart",
          "id": "SMART"
        },
        {
          "name": "СМЗ",
          "id": "SMZ"
        },
        {
          "name": "Soueast",
          "id": "SOUEAST"
        },
        {
          "name": "Spectre",
          "id": "SPECTRE"
        },
        {
          "name": "Spyker",
          "id": "SPYKER"
        },
        {
          "name": "SsangYong",
          "id": "SSANG_YONG"
        },
        {
          "name": "Steyr",
          "id": "STEYR"
        },
        {
          "name": "Studebaker",
          "id": "STUDEBAKER"
        },
        {
          "name": "Subaru",
          "id": "SUBARU"
        },
        {
          "name": "Suzuki",
          "id": "SUZUKI"
        },
        {
          "name": "ТагАЗ",
          "id": "TAGAZ"
        },
        {
          "name": "Talbot",
          "id": "TALBOT"
        },
        {
          "name": "Tank",
          "id": "TANK"
        },
        {
          "name": "TATA",
          "id": "TATA"
        },
        {
          "name": "Tatra",
          "id": "TATRA"
        },
        {
          "name": "Tazzari",
          "id": "TAZZARI"
        },
        {
          "name": "Tesla",
          "id": "TESLA"
        },
        {
          "name": "Think",
          "id": "THINK"
        },
        {
          "name": "Tianma",
          "id": "TIANMA"
        },
        {
          "name": "Tianye",
          "id": "TIANYE"
        },
        {
          "name": "Tofas",
          "id": "TOFAS"
        },
        {
          "name": "Toyota",
          "id": "TOYOTA"
        },
        {
          "name": "Trabant",
          "id": "TRABANT"
        },
        {
          "name": "Tramontana",
          "id": "TRAMONTANA"
        },
        {
          "name": "Triumph",
          "id": "TRIUMPH"
        },
        {
          "name": "TVR",
          "id": "TVR"
        },
        {
          "name": "УАЗ",
          "id": "UAZ"
        },
        {
          "name": "Ultima",
          "id": "ULTIMA"
        },
        {
          "name": "Vauxhall",
          "id": "VAUXHALL"
        },
        {
          "name": "LADA (ВАЗ)",
          "id": "VAZ"
        },
        {
          "name": "Vector",
          "id": "VECTOR"
        },
        {
          "name": "Venturi",
          "id": "VENTURI"
        },
        {
          "name": "Volkswagen",
          "id": "VOLKSWAGEN"
        },
        {
          "name": "Volvo",
          "id": "VOLVO"
        },
        {
          "name": "Vortex",
          "id": "VORTEX"
        },
        {
          "name": "Voyah",
          "id": "VOYAH"
        },
        {
          "name": "VUHL",
          "id": "VUHL"
        },
        {
          "name": "Wanderer",
          "id": "WANDERER"
        },
        {
          "name": "Wartburg",
          "id": "WARTBURG"
        },
        {
          "name": "Weltmeister",
          "id": "WELTMEISTER"
        },
        {
          "name": "Westfield",
          "id": "WESTFIELD"
        },
        {
          "name": "Wiesmann",
          "id": "WIESMANN"
        },
        {
          "name": "Willys",
          "id": "WILLIS"
        },
        {
          "name": "W Motors",
          "id": "W_MOTORS"
        },
        {
          "name": "Xin Kai",
          "id": "XINKAI"
        },
        {
          "name": "Xpeng",
          "id": "XPENG"
        },
        {
          "name": "Yulon",
          "id": "YULON"
        },
        {
          "name": "Zastava",
          "id": "ZASTAVA"
        },
        {
          "name": "ЗАЗ",
          "id": "ZAZ"
        },
        {
          "name": "Zeekr",
          "id": "ZEEKR"
        },
        {
          "name": "Zenos",
          "id": "ZENOS"
        },
        {
          "name": "Zenvo",
          "id": "ZENVO"
        },
        {
          "name": "Zibar",
          "id": "ZIBAR"
        },
        {
          "name": "ЗИЛ",
          "id": "ZIL"
        },
        {
          "name": "ЗиС",
          "id": "ZIS"
        },
        {
          "name": "Zotye",
          "id": "ZOTYE"
        },
        {
          "name": "ZX",
          "id": "ZX"
        }
      ]
    }
  }
}
</script>

<style scoped>

</style>