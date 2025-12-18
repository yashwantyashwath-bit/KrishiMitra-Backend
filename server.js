const express = require("express");
const cors = require("cors");

const app = express();
app.use(cors());
app.use(express.json());

// test route
app.get("/", (req, res) => {
  res.send("KrishiMitra Backend is Live 🚜");
});

// crop suggestion API
app.post("/api/farming/suggest", (req, res) => {
  const { soilType, ph, organicMatter, lat, lon } = req.body;

  res.json({
    primaryOption: {
      category: "Agriculture",
      recommendedCrops: [
        {
          crop: "Rice",
          score: 85,
          reason: "Suitable for loamy soil and adequate water availability"
        },
        {
          crop: "Maize",
          score: 75,
          reason: "Moderate rainfall and good market demand"
        }
      ]
    },
    secondaryOptions: [
      {
        name: "Dairy Farming",
        reason: "Regular income and manure support"
      }
    ],
    loanSchemes: [
      {
        schemeName: "PMFBY",
        purpose: "Crop insurance for farmers"
      }
    ]
  });
});

// 🔴 THIS PART WAS MISSING
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
