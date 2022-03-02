package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: akmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmv implements akmu {
    public static final ou a;

    static {
        ou ouVar = new ou(49);
        a = ouVar;
        ouVar.put(astl.CALENDAR_EVENT, 37);
        a.put(astl.CAR_RENTAL_PICKUP, 38);
        a.put(astl.CAR_RENTAL_RETURN, 39);
        a.put(astl.CONTACT_HOME, 40);
        a.put(astl.CONTACT_OTHER, 41);
        a.put(astl.CONTACT_WORK, 42);
        a.put(astl.EMAIL_PIVOTAL_SIGNAL, 43);
        a.put(astl.FLIGHT_ARRIVAL, 44);
        a.put(astl.FLIGHT_DEPARTURE, 45);
        a.put(astl.FLIGHT_LAYOVER, 46);
        a.put(astl.HOTEL_RESERVATION, 47);
        a.put(astl.LOW_CONFIDENCE_EVENT_RESERVATION, 48);
        a.put(astl.MAPS_CLICKS_CLICK_TO_CALL, 49);
        a.put(astl.MAPS_CLICKS_LOCALSEARCH_DETAIL, 50);
        a.put(astl.MAPS_CLICKS_LOCALSEARCH_MARKER, 51);
        a.put(astl.MAPS_CLICKS_LOCALSEARCH_TRUFFLE, 52);
        a.put(astl.MAPS_CLICKS_NAVIGATION, 53);
        a.put(astl.MAPS_CLICKS_NOT_INTERESTED, 54);
        a.put(astl.MAPS_CLICKS_SMARTMAPS, 56);
        a.put(astl.MAPS_CLICKS_START_DIRECTIONS, 57);
        a.put(astl.MAPS_CLICKS, 55);
        a.put(astl.MAPS_DIRECTIONS, 58);
        a.put(astl.MAPS_EMBED_LOAD_DIRECTION_RESULTS, 60);
        a.put(astl.MAPS_EMBED_LOAD_DIRECTIONS, 59);
        a.put(astl.MAPS_EMBED_LOAD_ENTITY, 61);
        a.put(astl.MAPS_EMBED_LOAD_RESULTS, 62);
        a.put(astl.MAPS_EMBED_LOAD_SEARCH, 63);
        a.put(astl.MAPS_NAV_RESULTS, 64);
        a.put(astl.MAPS_QUERIES_START_NAVIGATION, 66);
        a.put(astl.MAPS_QUERIES, 65);
        a.put(astl.MAPS_RESULTS, 67);
        a.put(astl.PERSONAL_RECOMMENDATION_EVENT, 68);
        a.put(astl.PERSONAL_RECOMMENDATION_PLACE, 69);
        a.put(astl.PLACE_RATING, 70);
        a.put(astl.PLACE_REVIEW, 71);
        a.put(astl.PLACE_STAR, 72);
        a.put(astl.PLACE_VISIT_USER_EDIT, 73);
        a.put(astl.PLUS_ONE, 74);
        a.put(astl.RECOMMENDED_EVENT_RESERVATION, 75);
        a.put(astl.RESTAURANT_RESERVATION, 76);
        a.put(astl.SEARCH_CLICKS, 77);
        a.put(astl.SEARCH_NAV_RESULTS, 78);
        a.put(astl.SEARCH_QUERIES, 80);
        a.put(astl.SEARCH_RESULTS, 79);
        a.put(astl.SHIPMENT, 81);
        a.put(astl.SOCIAL_EVENT_RESERVATION, 82);
        a.put(astl.TRAVEL_LOCATION_INTENT, 84);
        a.put(astl.TRIP, 83);
        a.put(astl.CHECKIN_EDIT, 89);
    }

    public final akmy a(akln akln, List list) {
        List<astm> list2;
        astv astv;
        List list3 = list;
        aklz.a();
        List a2 = akms.a(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            akkk akkk = (akkk) list3.get(i2);
            aklu aklu = (aklu) a2.get(i2);
            if (!akkk.d() && !akkk.e() && (astv = akkk.b) != null && astv.d.size() != 0) {
                aucx aucx = astv.d;
                int size = aucx.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        astl a3 = astl.a(((astm) aucx.get(i3)).b);
                        if (a3 == null) {
                            a3 = astl.INVALID;
                        }
                        if (!(a3 == astl.MAPS_CLICKS || a3 == astl.MAPS_CLICKS_CLICK_TO_CALL || a3 == astl.MAPS_CLICKS_HERE || a3 == astl.MAPS_CLICKS_LOCALSEARCH_DETAIL || a3 == astl.MAPS_CLICKS_LOCALSEARCH_MARKER || a3 == astl.MAPS_CLICKS_LOCALSEARCH_TRUFFLE || a3 == astl.MAPS_CLICKS_NAVIGATION || a3 == astl.MAPS_CLICKS_NOT_INTERESTED || a3 == astl.MAPS_CLICKS_SMARTMAPS || a3 == astl.MAPS_CLICKS_START_DIRECTIONS || a3 == astl.MAPS_DIRECTIONS || a3 == astl.MAPS_EMBED_LOAD_DIRECTIONS || a3 == astl.MAPS_EMBED_LOAD_DIRECTION_RESULTS || a3 == astl.MAPS_EMBED_LOAD_ENTITY || a3 == astl.MAPS_EMBED_LOAD_RESULTS || a3 == astl.MAPS_EMBED_LOAD_SEARCH || a3 == astl.MAPS_NAV_RESULTS || a3 == astl.MAPS_QUERIES || a3 == astl.MAPS_QUERIES_START_NAVIGATION || a3 == astl.MAPS_RESULTS || a3 == astl.SEARCH_CLICKS || a3 == astl.SEARCH_NAV_RESULTS || a3 == astl.SEARCH_QUERIES)) {
                            i3++;
                            if (a3 == astl.SEARCH_RESULTS) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                aklu.a(11, Float.valueOf(1.0f));
            }
            if (!akkk.d() && !akkk.e() && !akkk.f() && !akkk.g()) {
                long currentTimeMillis = System.currentTimeMillis();
                astv astv2 = akkk.b;
                if (astv2 != null) {
                    list2 = astv2.d;
                } else {
                    list2 = Collections.emptyList();
                }
                float f = 0.0f;
                for (astm astm : list2) {
                    if ((astm.a & 1) != 0 && astm.d.size() > 0) {
                        long a4 = astm.d.a(0) / 1000;
                        if (a4 < currentTimeMillis) {
                            ou ouVar = a;
                            astl a5 = astl.a(astm.b);
                            if (a5 == null) {
                                a5 = astl.INVALID;
                            }
                            Integer num = (Integer) ouVar.get(a5);
                            float f2 = ((float) (currentTimeMillis - a4)) / 3600000.0f;
                            if (num != null) {
                                aklu.a(num, Float.valueOf(akmt.a(f2, 0.1f, -1.0f)));
                            }
                            f = 1.0f;
                        }
                    }
                }
                aklu.a(26, Float.valueOf(f));
            }
            if (aklu.a() != 0) {
                i++;
            }
        }
        aklz.a();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Added GeoJournal features for ");
        sb.append(i);
        sb.append(" candidates");
        sb.toString();
        return new akmy(list3, a2);
    }

    public final String a() {
        return "GeoJournal";
    }
}
