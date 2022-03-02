package defpackage;

/* renamed from: astl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum astl implements auco {
    INVALID(0),
    DEPRECATED_BEENTHERE_ENTITY(186),
    DEPRECATED_HAPTIC_PLACE(188),
    FLIGHT_DEPARTURE(100),
    FLIGHT_ARRIVAL(101),
    FLIGHT_LAYOVER(102),
    SEARCH_CLICKS(150),
    SEARCH_QUERIES(151),
    SEARCH_RESULTS(152),
    SEARCH_NAV_RESULTS(153),
    MAPS_CLICKS(160),
    MAPS_QUERIES(161),
    MAPS_QUERIES_START_NAVIGATION(178),
    MAPS_RESULTS(162),
    MAPS_NAV_RESULTS(163),
    MAPS_DIRECTIONS(164),
    MAPS_CLICKS_CLICK_TO_CALL(165),
    MAPS_CLICKS_LOCALSEARCH_DETAIL(166),
    MAPS_CLICKS_LOCALSEARCH_MARKER(167),
    MAPS_CLICKS_LOCALSEARCH_TRUFFLE(179),
    MAPS_CLICKS_SMARTMAPS(168),
    MAPS_CLICKS_START_DIRECTIONS(169),
    MAPS_CLICKS_NAVIGATION(182),
    MAPS_CLICKS_NOT_INTERESTED(184),
    MAPS_CLICKS_HERE(206),
    MAPS_EMBED_LOAD_ENTITY(198),
    MAPS_EMBED_LOAD_SEARCH(199),
    MAPS_EMBED_LOAD_DIRECTIONS(200),
    MAPS_EMBED_LOAD_RESULTS(204),
    MAPS_EMBED_LOAD_DIRECTION_RESULTS(205),
    HOTEL_RESERVATION(170),
    RESTAURANT_RESERVATION(171),
    GOOGLE_PLUS_CHECKIN(172),
    PLUS_ONE(173),
    PLACE_REVIEW(174),
    PLACE_RATING(181),
    CALENDAR_EVENT(175),
    PLACE_STAR(176),
    PLACE_ON_LIST(217),
    DEPRECATED_PLACE_EDIT(180),
    PLACE_VISIT_USER_EDIT(196),
    CHECKIN_EDIT(216),
    PLACE_BEEN_HERE(201),
    DEPRECATED_IMAGE(177),
    IMAGE_USER_SPECIFIED(193),
    IMAGE_EXIF(194),
    IMAGE_LANDMARK_DETECTION(195),
    DEPRECATED_SOCIAL_EVENT(183),
    SOCIAL_EVENT_RESERVATION(185),
    LOW_CONFIDENCE_EVENT_RESERVATION(212),
    RECOMMENDED_EVENT_RESERVATION(213),
    REMINDER(187),
    CAR_RENTAL_PICKUP(189),
    CAR_RENTAL_RETURN(190),
    CONTACT_HOME(191),
    CONTACT_WORK(192),
    CONTACT_OTHER(211),
    TRIP(197),
    TRANSPORTATION_DEPARTURE(202),
    TRANSPORTATION_ARRIVAL(203),
    CRUISE_RESERVATION(207),
    PERSONAL_RECOMMENDATION_PLACE(208),
    PERSONAL_RECOMMENDATION_EVENT(209),
    EMAIL_PIVOTAL_SIGNAL(210),
    SHIPMENT(214),
    TRAVEL_LOCATION_INTENT(215);
    
    public final int ao;

    private astl(int i) {
        this.ao = i;
    }

    public static astl a(int i) {
        if (i == 0) {
            return INVALID;
        }
        switch (i) {
            case 100:
                return FLIGHT_DEPARTURE;
            case 101:
                return FLIGHT_ARRIVAL;
            case 102:
                return FLIGHT_LAYOVER;
            default:
                switch (i) {
                    case 150:
                        return SEARCH_CLICKS;
                    case 151:
                        return SEARCH_QUERIES;
                    case 152:
                        return SEARCH_RESULTS;
                    case 153:
                        return SEARCH_NAV_RESULTS;
                    default:
                        switch (i) {
                            case 160:
                                return MAPS_CLICKS;
                            case 161:
                                return MAPS_QUERIES;
                            case 162:
                                return MAPS_RESULTS;
                            case 163:
                                return MAPS_NAV_RESULTS;
                            case 164:
                                return MAPS_DIRECTIONS;
                            case 165:
                                return MAPS_CLICKS_CLICK_TO_CALL;
                            case 166:
                                return MAPS_CLICKS_LOCALSEARCH_DETAIL;
                            case 167:
                                return MAPS_CLICKS_LOCALSEARCH_MARKER;
                            case 168:
                                return MAPS_CLICKS_SMARTMAPS;
                            case 169:
                                return MAPS_CLICKS_START_DIRECTIONS;
                            case 170:
                                return HOTEL_RESERVATION;
                            case 171:
                                return RESTAURANT_RESERVATION;
                            case 172:
                                return GOOGLE_PLUS_CHECKIN;
                            case 173:
                                return PLUS_ONE;
                            case 174:
                                return PLACE_REVIEW;
                            case 175:
                                return CALENDAR_EVENT;
                            case 176:
                                return PLACE_STAR;
                            case 177:
                                return DEPRECATED_IMAGE;
                            case 178:
                                return MAPS_QUERIES_START_NAVIGATION;
                            case 179:
                                return MAPS_CLICKS_LOCALSEARCH_TRUFFLE;
                            case 180:
                                return DEPRECATED_PLACE_EDIT;
                            case 181:
                                return PLACE_RATING;
                            case 182:
                                return MAPS_CLICKS_NAVIGATION;
                            case 183:
                                return DEPRECATED_SOCIAL_EVENT;
                            case 184:
                                return MAPS_CLICKS_NOT_INTERESTED;
                            case 185:
                                return SOCIAL_EVENT_RESERVATION;
                            case 186:
                                return DEPRECATED_BEENTHERE_ENTITY;
                            case 187:
                                return REMINDER;
                            case 188:
                                return DEPRECATED_HAPTIC_PLACE;
                            case 189:
                                return CAR_RENTAL_PICKUP;
                            case 190:
                                return CAR_RENTAL_RETURN;
                            case 191:
                                return CONTACT_HOME;
                            case 192:
                                return CONTACT_WORK;
                            case 193:
                                return IMAGE_USER_SPECIFIED;
                            case 194:
                                return IMAGE_EXIF;
                            case 195:
                                return IMAGE_LANDMARK_DETECTION;
                            case 196:
                                return PLACE_VISIT_USER_EDIT;
                            case 197:
                                return TRIP;
                            case 198:
                                return MAPS_EMBED_LOAD_ENTITY;
                            case 199:
                                return MAPS_EMBED_LOAD_SEARCH;
                            case 200:
                                return MAPS_EMBED_LOAD_DIRECTIONS;
                            case 201:
                                return PLACE_BEEN_HERE;
                            case 202:
                                return TRANSPORTATION_DEPARTURE;
                            case 203:
                                return TRANSPORTATION_ARRIVAL;
                            case 204:
                                return MAPS_EMBED_LOAD_RESULTS;
                            case 205:
                                return MAPS_EMBED_LOAD_DIRECTION_RESULTS;
                            case 206:
                                return MAPS_CLICKS_HERE;
                            case 207:
                                return CRUISE_RESERVATION;
                            case 208:
                                return PERSONAL_RECOMMENDATION_PLACE;
                            case 209:
                                return PERSONAL_RECOMMENDATION_EVENT;
                            case 210:
                                return EMAIL_PIVOTAL_SIGNAL;
                            case 211:
                                return CONTACT_OTHER;
                            case 212:
                                return LOW_CONFIDENCE_EVENT_RESERVATION;
                            case 213:
                                return RECOMMENDED_EVENT_RESERVATION;
                            case 214:
                                return SHIPMENT;
                            case 215:
                                return TRAVEL_LOCATION_INTENT;
                            case 216:
                                return CHECKIN_EDIT;
                            case 217:
                                return PLACE_ON_LIST;
                            default:
                                return null;
                        }
                }
        }
    }

    public static aucq b() {
        return astk.a;
    }

    public final int a() {
        return this.ao;
    }

    public final String toString() {
        return Integer.toString(this.ao);
    }
}
