package responsePojo;

import java.util.ArrayList;
import java.util.Date;

public class GetLatestLaunchesResponsePojo {

	public Fairings fairings;
	public Links links;
	public Object static_fire_date_utc;
	public Object static_fire_date_unix;
	public boolean net;
	public Object window;
	public String rocket;
	public boolean success;
	public ArrayList<Object> failures;
	public Object details;
	public ArrayList<Object> crew;
	public ArrayList<String> ships;
	public ArrayList<Object> capsules;
	public ArrayList<String> payloads;
	public String launchpad;
	public int flight_number;
	public String name;
	public Date date_utc;
	public int date_unix;
	public Date date_local;
	public String date_precision;
	public boolean upcoming;
	public ArrayList<Core> cores;
	public boolean auto_update;
	public boolean tbd;
	public String launch_library_id;
	public String id;

	public class Fairings{
		public Object reused;
		public boolean recovery_attempt;
		public Object recovered;
		public ArrayList<String> ships;
		public Object getReused() {
			return reused;
		}
		public void setReused(Object reused) {
			this.reused = reused;
		}
		public boolean isRecovery_attempt() {
			return recovery_attempt;
		}
		public void setRecovery_attempt(boolean recovery_attempt) {
			this.recovery_attempt = recovery_attempt;
		}
		public Object getRecovered() {
			return recovered;
		}
		public void setRecovered(Object recovered) {
			this.recovered = recovered;
		}
		public ArrayList<String> getShips() {
			return ships;
		}
		public void setShips(ArrayList<String> ships) {
			this.ships = ships;
		}
	}

	public static class Patch{
		public String small;
		public String large;
		public String getSmall() {
			return small;
		}
		public void setSmall(String small) {
			this.small = small;
		}
		public String getLarge() {
			return large;
		}
		public void setLarge(String large) {
			this.large = large;
		}
	}

	public static class Reddit{
		public String campaign;
		public String launch;
		public Object media;
		public String recovery;
		public String getCampaign() {
			return campaign;
		}
		public void setCampaign(String campaign) {
			this.campaign = campaign;
		}
		public String getLaunch() {
			return launch;
		}
		public void setLaunch(String launch) {
			this.launch = launch;
		}
		public Object getMedia() {
			return media;
		}
		public void setMedia(Object media) {
			this.media = media;
		}
		public String getRecovery() {
			return recovery;
		}
		public void setRecovery(String recovery) {
			this.recovery = recovery;
		}
	}

	public static class Flickr{
		public ArrayList<Object> small;
		public ArrayList<Object> original;
		public ArrayList<Object> getSmall() {
			return small;
		}
		public void setSmall(ArrayList<Object> small) {
			this.small = small;
		}
		public ArrayList<Object> getOriginal() {
			return original;
		}
		public void setOriginal(ArrayList<Object> original) {
			this.original = original;
		}
	}

	public static class Links{
		public Patch patch;
		public Reddit reddit;
		public Flickr flickr;
		public Object presskit;
		public String webcast;
		public String youtube_id;
		public Object article;
		public String wikipedia;
		public Patch getPatch() {
			return patch;
		}
		public void setPatch(Patch patch) {
			this.patch = patch;
		}
		public Reddit getReddit() {
			return reddit;
		}
		public void setReddit(Reddit reddit) {
			this.reddit = reddit;
		}
		public Flickr getFlickr() {
			return flickr;
		}
		public void setFlickr(Flickr flickr) {
			this.flickr = flickr;
		}
		public Object getPresskit() {
			return presskit;
		}
		public void setPresskit(Object presskit) {
			this.presskit = presskit;
		}
		public String getWebcast() {
			return webcast;
		}
		public void setWebcast(String webcast) {
			this.webcast = webcast;
		}
		public String getYoutube_id() {
			return youtube_id;
		}
		public void setYoutube_id(String youtube_id) {
			this.youtube_id = youtube_id;
		}
		public Object getArticle() {
			return article;
		}
		public void setArticle(Object article) {
			this.article = article;
		}
		public String getWikipedia() {
			return wikipedia;
		}
		public void setWikipedia(String wikipedia) {
			this.wikipedia = wikipedia;
		}
	}

	public static class Core{
		public String core;
		public int flight;
		public boolean gridfins;
		public boolean legs;
		public boolean reused;
		public boolean landing_attempt;
		public boolean landing_success;
		public String landing_type;
		public String landpad;
		public String getCore() {
			return core;
		}
		public void setCore(String core) {
			this.core = core;
		}
		public int getFlight() {
			return flight;
		}
		public void setFlight(int flight) {
			this.flight = flight;
		}
		public boolean isGridfins() {
			return gridfins;
		}
		public void setGridfins(boolean gridfins) {
			this.gridfins = gridfins;
		}
		public boolean isLegs() {
			return legs;
		}
		public void setLegs(boolean legs) {
			this.legs = legs;
		}
		public boolean isReused() {
			return reused;
		}
		public void setReused(boolean reused) {
			this.reused = reused;
		}
		public boolean isLanding_attempt() {
			return landing_attempt;
		}
		public void setLanding_attempt(boolean landing_attempt) {
			this.landing_attempt = landing_attempt;
		}
		public boolean isLanding_success() {
			return landing_success;
		}
		public void setLanding_success(boolean landing_success) {
			this.landing_success = landing_success;
		}
		public String getLanding_type() {
			return landing_type;
		}
		public void setLanding_type(String landing_type) {
			this.landing_type = landing_type;
		}
		public String getLandpad() {
			return landpad;
		}
		public void setLandpad(String landpad) {
			this.landpad = landpad;
		}
	}

	public Fairings getFairings() {
		return fairings;
	}

	public void setFairings(Fairings fairings) {
		this.fairings = fairings;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public Object getStatic_fire_date_utc() {
		return static_fire_date_utc;
	}

	public void setStatic_fire_date_utc(Object static_fire_date_utc) {
		this.static_fire_date_utc = static_fire_date_utc;
	}

	public Object getStatic_fire_date_unix() {
		return static_fire_date_unix;
	}

	public void setStatic_fire_date_unix(Object static_fire_date_unix) {
		this.static_fire_date_unix = static_fire_date_unix;
	}

	public boolean isNet() {
		return net;
	}

	public void setNet(boolean net) {
		this.net = net;
	}

	public Object getWindow() {
		return window;
	}

	public void setWindow(Object window) {
		this.window = window;
	}

	public String getRocket() {
		return rocket;
	}

	public void setRocket(String rocket) {
		this.rocket = rocket;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ArrayList<Object> getFailures() {
		return failures;
	}

	public void setFailures(ArrayList<Object> failures) {
		this.failures = failures;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}

	public ArrayList<Object> getCrew() {
		return crew;
	}

	public void setCrew(ArrayList<Object> crew) {
		this.crew = crew;
	}

	public ArrayList<String> getShips() {
		return ships;
	}

	public void setShips(ArrayList<String> ships) {
		this.ships = ships;
	}

	public ArrayList<Object> getCapsules() {
		return capsules;
	}

	public void setCapsules(ArrayList<Object> capsules) {
		this.capsules = capsules;
	}

	public ArrayList<String> getPayloads() {
		return payloads;
	}

	public void setPayloads(ArrayList<String> payloads) {
		this.payloads = payloads;
	}

	public String getLaunchpad() {
		return launchpad;
	}

	public void setLaunchpad(String launchpad) {
		this.launchpad = launchpad;
	}

	public int getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate_utc() {
		return date_utc;
	}

	public void setDate_utc(Date date_utc) {
		this.date_utc = date_utc;
	}

	public int getDate_unix() {
		return date_unix;
	}

	public void setDate_unix(int date_unix) {
		this.date_unix = date_unix;
	}

	public Date getDate_local() {
		return date_local;
	}

	public void setDate_local(Date date_local) {
		this.date_local = date_local;
	}

	public String getDate_precision() {
		return date_precision;
	}

	public void setDate_precision(String date_precision) {
		this.date_precision = date_precision;
	}

	public boolean isUpcoming() {
		return upcoming;
	}

	public void setUpcoming(boolean upcoming) {
		this.upcoming = upcoming;
	}

	public ArrayList<Core> getCores() {
		return cores;
	}

	public void setCores(ArrayList<Core> cores) {
		this.cores = cores;
	}

	public boolean isAuto_update() {
		return auto_update;
	}

	public void setAuto_update(boolean auto_update) {
		this.auto_update = auto_update;
	}

	public boolean isTbd() {
		return tbd;
	}

	public void setTbd(boolean tbd) {
		this.tbd = tbd;
	}

	public String getLaunch_library_id() {
		return launch_library_id;
	}

	public void setLaunch_library_id(String launch_library_id) {
		this.launch_library_id = launch_library_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
