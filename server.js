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
app.post("/crop-suggestion", (req, res) => {
  const { soil, season, language } = req.body;

  const suggestions = {
    en: "Rice is suitable for your soil and season.",
    te: "మీ నేల మరియు కాలానికి వరి అనుకూలంగా ఉంటుంది.",
    kn: "ನಿಮ್ಮ ಮಣ್ಣು ಮತ್ತು ಹಂಗಾಮಿಗೆ ಭತ್ತ ಸೂಕ್ತವಾಗಿದೆ.",
    hi: "आपकी मिट्टी और मौसम के लिए धान उपयुक्त है।"
  };

  res.json({
    success: true,
    suggestion: suggestions[language] || suggestions.en
  });
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
