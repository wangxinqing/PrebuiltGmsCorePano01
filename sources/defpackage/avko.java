package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: avko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avko implements auco {
    UNKNOWN_APPLICATION(0),
    GMAIL(1),
    GPLUS_WEB(2),
    GOOGLE_VOICE(3),
    HANGOUT_START_PAGE(4),
    DYNAMITE(5),
    GROUPS_UI(6),
    CALENDAR(7),
    MAPS(8),
    YAQS(9),
    BUGANIZER(10),
    NETDEPLOY(11),
    ORG_CHART(12),
    ONCALLATOR(13),
    GUTS(14),
    BABEL(15),
    BIGTOP(16),
    DOCS(17),
    DRIVE(18),
    GOOGLE_QUICK_SEARCH_BOX(19),
    GPLUS(20),
    TEST_APPLICATION(21),
    PLAY_STORE(22),
    ELDAR(23),
    ESTIGO(24),
    PLX(25),
    SUPERPONG(26),
    DEVOPS_CONSOLE(27),
    APOTHECA(28),
    GHIRE(29),
    ICENTRAL(30),
    KRONOS(31),
    SLIDES(32),
    SHEETS(33),
    DRAWINGS(34),
    MEET(35),
    IRM(36),
    MEME(37),
    HUB(38),
    DRIVE_SHARING(39),
    HONEYCOMB(40),
    IMAGERY_REQUEST(41),
    PEOPLEKIT_DEMO(42),
    GANTRY(43);
    
    public final int S;

    private avko(int i) {
        this.S = i;
    }

    public static avko a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_APPLICATION;
            case 1:
                return GMAIL;
            case 2:
                return GPLUS_WEB;
            case 3:
                return GOOGLE_VOICE;
            case 4:
                return HANGOUT_START_PAGE;
            case 5:
                return DYNAMITE;
            case 6:
                return GROUPS_UI;
            case 7:
                return CALENDAR;
            case 8:
                return MAPS;
            case 9:
                return YAQS;
            case 10:
                return BUGANIZER;
            case 11:
                return NETDEPLOY;
            case 12:
                return ORG_CHART;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return ONCALLATOR;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return GUTS;
            case Service.START_CONTINUATION_MASK:
                return BABEL;
            case 16:
                return BIGTOP;
            case 17:
                return DOCS;
            case 18:
                return DRIVE;
            case 19:
                return GOOGLE_QUICK_SEARCH_BOX;
            case 20:
                return GPLUS;
            case 21:
                return TEST_APPLICATION;
            case 22:
                return PLAY_STORE;
            case 23:
                return ELDAR;
            case 24:
                return ESTIGO;
            case 25:
                return PLX;
            case 26:
                return SUPERPONG;
            case 27:
                return DEVOPS_CONSOLE;
            case 28:
                return APOTHECA;
            case 29:
                return GHIRE;
            case 30:
                return ICENTRAL;
            case 31:
                return KRONOS;
            case 32:
                return SLIDES;
            case 33:
                return SHEETS;
            case 34:
                return DRAWINGS;
            case 35:
                return MEET;
            case 36:
                return IRM;
            case 37:
                return MEME;
            case 38:
                return HUB;
            case 39:
                return DRIVE_SHARING;
            case 40:
                return HONEYCOMB;
            case 41:
                return IMAGERY_REQUEST;
            case 42:
                return PEOPLEKIT_DEMO;
            case 43:
                return GANTRY;
            default:
                return null;
        }
    }

    public static aucq b() {
        return avkn.a;
    }

    public final int a() {
        return this.S;
    }

    public final String toString() {
        return Integer.toString(this.S);
    }
}
