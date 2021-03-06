package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: aqub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqub implements auco {
    ADDRESS_COMPONENT_TYPE_UNSPECIFIED(0),
    STREET_ADDRESS(1),
    ROUTE(2),
    INTERSECTION(3),
    POLITICAL(4),
    COUNTRY(5),
    ADMINISTRATIVE_AREA_LEVEL_1(6),
    ADMINISTRATIVE_AREA_LEVEL_2(7),
    ADMINISTRATIVE_AREA_LEVEL_3(8),
    ADMINISTRATIVE_AREA_LEVEL_4(9),
    ADMINISTRATIVE_AREA_LEVEL_5(10),
    COLLOQUIAL_AREA(11),
    LOCALITY(12),
    WARD(13),
    SUBLOCALITY(14),
    SUBLOCALITY_LEVEL_1(15),
    SUBLOCALITY_LEVEL_2(16),
    SUBLOCALITY_LEVEL_3(17),
    SUBLOCALITY_LEVEL_4(18),
    SUBLOCALITY_LEVEL_5(19),
    NEIGHBORHOOD(20),
    PREMISE(21),
    SUBPREMISE(22),
    POSTAL_CODE(23),
    NATURAL_FEATURE(24),
    AIRPORT(25),
    PARK(26),
    POINT_OF_INTEREST(27),
    FLOOR(28),
    ESTABLISHMENT(29),
    PARKING(30),
    POST_BOX(31),
    POSTAL_TOWN(32),
    ROOM(33),
    STREET_NUMBER(34),
    BUS_STATION(35),
    TRAIN_STATION(36),
    TRANSIT_STATION(37);
    
    private final int M;

    private aqub(int i) {
        this.M = i;
    }

    public static aqub a(int i) {
        switch (i) {
            case 0:
                return ADDRESS_COMPONENT_TYPE_UNSPECIFIED;
            case 1:
                return STREET_ADDRESS;
            case 2:
                return ROUTE;
            case 3:
                return INTERSECTION;
            case 4:
                return POLITICAL;
            case 5:
                return COUNTRY;
            case 6:
                return ADMINISTRATIVE_AREA_LEVEL_1;
            case 7:
                return ADMINISTRATIVE_AREA_LEVEL_2;
            case 8:
                return ADMINISTRATIVE_AREA_LEVEL_3;
            case 9:
                return ADMINISTRATIVE_AREA_LEVEL_4;
            case 10:
                return ADMINISTRATIVE_AREA_LEVEL_5;
            case 11:
                return COLLOQUIAL_AREA;
            case 12:
                return LOCALITY;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return WARD;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return SUBLOCALITY;
            case Service.START_CONTINUATION_MASK:
                return SUBLOCALITY_LEVEL_1;
            case 16:
                return SUBLOCALITY_LEVEL_2;
            case 17:
                return SUBLOCALITY_LEVEL_3;
            case 18:
                return SUBLOCALITY_LEVEL_4;
            case 19:
                return SUBLOCALITY_LEVEL_5;
            case 20:
                return NEIGHBORHOOD;
            case 21:
                return PREMISE;
            case 22:
                return SUBPREMISE;
            case 23:
                return POSTAL_CODE;
            case 24:
                return NATURAL_FEATURE;
            case 25:
                return AIRPORT;
            case 26:
                return PARK;
            case 27:
                return POINT_OF_INTEREST;
            case 28:
                return FLOOR;
            case 29:
                return ESTABLISHMENT;
            case 30:
                return PARKING;
            case 31:
                return POST_BOX;
            case 32:
                return POSTAL_TOWN;
            case 33:
                return ROOM;
            case 34:
                return STREET_NUMBER;
            case 35:
                return BUS_STATION;
            case 36:
                return TRAIN_STATION;
            case 37:
                return TRANSIT_STATION;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aqua.a;
    }

    public final int a() {
        return this.M;
    }

    public final String toString() {
        return Integer.toString(this.M);
    }
}
