package saddam.razon.testall;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MovieDetails {
    @SerializedName("adult")
    private final boolean adult;

    @SerializedName("backdrop_path")
    private final String backdropPath;

    @SerializedName("belongs_to_collection")
    private final BelongsToCollection belongsToCollection;

    @SerializedName("budget")
    private final int budget;

    @SerializedName("genres")
    private final List<Genres> genres;

    @SerializedName("homepage")
    private final String homepage;

    @SerializedName("id")
    private final int id;

    @SerializedName("imdb_id")
    private final String imdbId;

    @SerializedName("original_language")
    private final String originalLanguage;

    @SerializedName("original_title")
    private final String originalTitle;

    @SerializedName("overview")
    private final String overview;

    @SerializedName("popularity")
    private final double popularity;

    @SerializedName("poster_path")
    private final String posterPath;

    @SerializedName("production_companies")
    private final List<ProductionCompanies> productionCompanies;

    @SerializedName("production_countries")
    private final List<ProductionCountries> productionCountries;

    @SerializedName("release_date")
    private final String releaseDate;

    @SerializedName("revenue")
    private final int revenue;

    @SerializedName("runtime")
    private final int runtime;

    @SerializedName("spoken_languages")
    private final List<SpokenLanguages> spokenLanguages;

    @SerializedName("status")
    private final String status;

    @SerializedName("tagline")
    private final String tagline;

    @SerializedName("title")
    private final String title;

    @SerializedName("video")
    private final boolean video;

    @SerializedName("vote_average")
    private final double voteAverage;

    @SerializedName("vote_count")
    private final int voteCount;

    public MovieDetails(boolean adult, String backdropPath, BelongsToCollection belongsToCollection,
                        int budget, List<Genres> genres, String homepage, int id, String imdbId,
                        String originalLanguage, String originalTitle, String overview, double popularity,
                        String posterPath, List<ProductionCompanies> productionCompanies,
                        List<ProductionCountries> productionCountries, String releaseDate, int revenue,
                        int runtime, List<SpokenLanguages> spokenLanguages, String status, String tagline,
                        String title, boolean video, double voteAverage, int voteCount) {
        this.adult = adult;
        this.backdropPath = backdropPath;
        this.belongsToCollection = belongsToCollection;
        this.budget = budget;
        this.genres = genres;
        this.homepage = homepage;
        this.id = id;
        this.imdbId = imdbId;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.posterPath = posterPath;
        this.productionCompanies = productionCompanies;
        this.productionCountries = productionCountries;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.runtime = runtime;
        this.spokenLanguages = spokenLanguages;
        this.status = status;
        this.tagline = tagline;
        this.title = title;
        this.video = video;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public BelongsToCollection getBelongsToCollection() {
        return belongsToCollection;
    }

    public int getBudget() {
        return budget;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public List<ProductionCompanies> getProductionCompanies() {
        return productionCompanies;
    }

    public List<ProductionCountries> getProductionCountries() {
        return productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public List<SpokenLanguages> getSpokenLanguages() {
        return spokenLanguages;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public static class BelongsToCollection {
        @SerializedName("id")
        private final int id;

        @SerializedName("name")
        private final String name;

        @SerializedName("poster_path")
        private final Object posterPath;

        @SerializedName("backdrop_path")
        private final Object backdropPath;

        public BelongsToCollection(int id, String name, Object posterPath, Object backdropPath) {
            this.id = id;
            this.name = name;
            this.posterPath = posterPath;
            this.backdropPath = backdropPath;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Object getPosterPath() {
            return posterPath;
        }

        public Object getBackdropPath() {
            return backdropPath;
        }
    }

    public static class Genres {
        @SerializedName("id")
        private final int id;

        @SerializedName("name")
        private final String name;

        public Genres(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class ProductionCompanies {
        @SerializedName("name")
        private final String name;

        @SerializedName("id")
        private final int id;

        public ProductionCompanies(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

    public static class ProductionCountries {
        @SerializedName("iso_3166_1")
        private final String iso31661;

        @SerializedName("name")
        private final String name;

        public ProductionCountries(String iso31661, String name) {
            this.iso31661 = iso31661;
            this.name = name;
        }

        public String getIso31661() {
            return iso31661;
        }

        public String getName() {
            return name;
        }
    }

    public static class SpokenLanguages {
        @SerializedName("iso_639_1")
        private final String iso6391;

        @SerializedName("name")
        private final String name;

        public SpokenLanguages(String iso6391, String name) {
            this.iso6391 = iso6391;
            this.name = name;
        }

        public String getIso6391() {
            return iso6391;
        }

        public String getName() {
            return name;
        }
    }
}
