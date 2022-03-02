package defpackage;

import android.content.Context;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Service;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* renamed from: lgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lgc implements lfq {
    public static final ith a = new ith("ImpressionLogEvent", "");
    public final agyf b;
    public final Context c;
    public String d;
    public final aucd e;
    private final lgd f;
    private boolean g = false;

    public lgc(lgd lgd, Context context) {
        iva.a((Object) lgd);
        this.f = lgd;
        iva.a((Object) context);
        this.c = context;
        this.b = new agyf(agyl.a);
        this.e = ambk.K.o();
    }

    private static final int b(ldf ldf) {
        String a2 = ldf.a();
        if ("IDLE".equals(a2)) {
            return 2;
        }
        if ("HIGH".equals(a2)) {
            return 4;
        }
        if ("LOW".equals(a2)) {
            return 3;
        }
        a.b("ImpressionLogEvent", "Unknown activity level name: %s", a2);
        return 1;
    }

    public final void a() {
        k();
        this.g = true;
        int i = jhg.a;
        aucd o = ambm.d.o();
        aucd aucd = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ambm ambm = (ambm) o.b;
        ambk ambk = (ambk) aucd.i();
        ambk.getClass();
        ambm.c = ambk;
        ambm.a |= 512;
        this.b.a((ambm) o.i());
        this.f.a(this);
    }

    public final lfo c() {
        return new lgf(this);
    }

    public final lfm d() {
        return new lfz(this);
    }

    public final lfk e() {
        return new lfx(this);
    }

    public final lfn g() {
        return new lga(this);
    }

    public final void k() {
        if (this.g) {
            throw new IllegalStateException("Event already sent", (Throwable) null);
        }
    }

    public final /* bridge */ /* synthetic */ lfp f() {
        return new lgg(this);
    }

    public final /* bridge */ /* synthetic */ void h() {
        k();
        agyf agyf = this.b;
        alzl alzl = ((alzm) agyf.b.b).f;
        if (alzl == null) {
            alzl = alzl.e;
        }
        alzh alzh = alzl.c;
        if (alzh == null) {
            alzh = alzh.d;
        }
        if ((alzh.a & 1) != 0) {
            aucd aucd = agyf.b;
            alzl alzl2 = ((alzm) aucd.b).f;
            if (alzl2 == null) {
                alzl2 = alzl.e;
            }
            aucd aucd2 = (aucd) alzl2.c(5);
            aucd2.a((aucj) alzl2);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            alzl alzl3 = (alzl) aucd2.b;
            alzl3.d = 2;
            alzl3.a |= 4;
            alzl alzl4 = ((alzm) agyf.b.b).f;
            if (alzl4 == null) {
                alzl4 = alzl.e;
            }
            alzh alzh2 = alzl4.c;
            if (alzh2 == null) {
                alzh2 = alzh.d;
            }
            aucd aucd3 = (aucd) alzh2.c(5);
            aucd3.a((aucj) alzh2);
            long a2 = agyf.a.a();
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            alzh alzh3 = (alzh) aucd3.b;
            alzh3.a |= 2;
            alzh3.c = a2;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            alzl alzl5 = (alzl) aucd2.b;
            alzh alzh4 = (alzh) aucd3.i();
            alzh4.getClass();
            alzl5.c = alzh4;
            alzl5.a |= 2;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            alzm alzm = (alzm) aucd.b;
            alzl alzl6 = (alzl) aucd2.i();
            alzm alzm2 = alzm.g;
            alzl6.getClass();
            alzm.f = alzl6;
            alzm.a |= 2048;
            return;
        }
        throw new IllegalStateException("must call setElapsedStartTimeToSystemTime first");
    }

    public final /* bridge */ /* synthetic */ void i() {
        k();
        agyf agyf = this.b;
        aucd aucd = agyf.b;
        aucd o = alzl.e.o();
        aucd o2 = alzh.d.o();
        long a2 = agyf.a.a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        alzh alzh = (alzh) o2.b;
        alzh.a |= 1;
        alzh.b = a2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        alzl alzl = (alzl) o.b;
        alzh alzh2 = (alzh) o2.i();
        alzh2.getClass();
        alzl.c = alzh2;
        alzl.a |= 2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzm alzm = (alzm) aucd.b;
        alzl alzl2 = (alzl) o.i();
        alzm alzm2 = alzm.g;
        alzl2.getClass();
        alzm.f = alzl2;
        alzm.a |= 2048;
    }

    public final /* bridge */ /* synthetic */ void j() {
        k();
        this.b.a();
    }

    public final /* bridge */ /* synthetic */ void c(int i) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setEventDeliveryMechanism() twice");
        if (i != 0) {
            aucd aucd = this.e;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambk ambk = (ambk) aucd.b;
            ambk ambk2 = ambk.K;
            ambk.f = 2;
            ambk.a |= 8;
            return;
        }
        aucd aucd2 = this.e;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        ambk ambk3 = (ambk) aucd2.b;
        ambk ambk4 = ambk.K;
        ambk3.f = 1;
        ambk3.a |= 8;
    }

    public final /* bridge */ /* synthetic */ void d(int i) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setFileType() twice");
        if (i == 0) {
            aucd aucd = this.e;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambk ambk = (ambk) aucd.b;
            ambk ambk2 = ambk.K;
            ambk.h = 1;
            ambk.a |= 32;
        } else if (i != 1) {
            a.b("ImpressionLogEvent", "Unknown file type: %d", Integer.valueOf(i));
            aucd aucd2 = this.e;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ambk ambk3 = (ambk) aucd2.b;
            ambk ambk4 = ambk.K;
            ambk3.h = 0;
            ambk3.a |= 32;
        } else {
            aucd aucd3 = this.e;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            ambk ambk5 = (ambk) aucd3.b;
            ambk ambk6 = ambk.K;
            ambk5.h = 2;
            ambk5.a |= 32;
        }
    }

    public final /* bridge */ /* synthetic */ void e(int i) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setUiResult() twice");
        if (i == 0) {
            aucd aucd = this.e;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambk ambk = (ambk) aucd.b;
            ambk ambk2 = ambk.K;
            ambk.p = 1;
            ambk.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        } else if (i == 1) {
            aucd aucd2 = this.e;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ambk ambk3 = (ambk) aucd2.b;
            ambk ambk4 = ambk.K;
            ambk3.p = 2;
            ambk3.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        } else if (i != 2) {
            aucd aucd3 = this.e;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            ambk ambk5 = (ambk) aucd3.b;
            ambk ambk6 = ambk.K;
            ambk5.p = 4;
            ambk5.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        } else {
            aucd aucd4 = this.e;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            ambk ambk7 = (ambk) aucd4.b;
            ambk ambk8 = ambk.K;
            ambk7.p = 3;
            ambk7.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        }
    }

    /* renamed from: f */
    public final void a(int i) {
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        ambk.a |= 33554432;
        ambk.B = i;
    }

    private static final alzy b(kaj kaj) {
        lgw lgw = lgw.DISCONNECTED;
        kaj kaj2 = kaj.NULL;
        switch (kaj.ordinal()) {
            case 1:
                return alzy.SET_APP_AUTH_STATE_ACTION;
            case 2:
                return alzy.METADATA_ACTION;
            case 4:
                return alzy.CONTENT_AND_METADATA_ACTION;
            case 6:
                return alzy.CREATE_FILE_ACTION;
            case 7:
                return alzy.CREATE_SHORTCUT_FILE_ACTION;
            case 8:
                return alzy.CREATE_FOLDER_ACTION;
            case 10:
                return alzy.TRASH_ACTION;
            case 12:
                return alzy.DELETE_FILE_ACTION;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return alzy.SET_RESOURCE_PARENTS_ACTION;
            case Service.START_CONTINUATION_MASK:
                return alzy.CHANGE_RESOURCE_PARENTS_ACTION;
            case 16:
                return alzy.SET_SUBSCRIBED_ACTION;
            case 17:
                return alzy.ADD_PERMISSION_ACTION;
            case 18:
                return alzy.UPDATE_PERMISSION_ACTION;
            case 19:
                return alzy.REMOVE_PERMISSION_ACTION;
            default:
                a.b("ImpressionLogEvent", "Unknown action type: %s", kaj);
                return alzy.UNKNOWN_ACTION_TYPE;
        }
    }

    public final void a(int i, int i2) {
        k();
        iva.a(!((((ambk) this.e.b).a & 67108864) != 0), (Object) "Can't call setPermissionDetails twice");
        aucd o = amay.d.o();
        switch (i) {
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amay amay = (amay) o.b;
                amay.b = 1;
                amay.a |= 1;
                break;
            case 257:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amay amay2 = (amay) o.b;
                amay2.b = 2;
                amay2.a |= 1;
                break;
            case 258:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amay amay3 = (amay) o.b;
                amay3.b = 3;
                amay3.a |= 1;
                break;
            default:
                a.b("ImpressionLogEvent", "Unknown account type code: %d", Integer.valueOf(i));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amay amay4 = (amay) o.b;
                amay4.b = 0;
                amay4.a |= 1;
                break;
        }
        if (i2 == -100) {
            amay amay5 = (amay) o.b;
            amay5.c = 5;
            amay5.a |= 2;
        } else if (i2 == 0) {
            amay amay6 = (amay) o.b;
            amay6.c = 1;
            amay6.a |= 2;
        } else if (i2 == 1) {
            amay amay7 = (amay) o.b;
            amay7.c = 2;
            amay7.a |= 2;
        } else if (i2 == 2) {
            amay amay8 = (amay) o.b;
            amay8.c = 3;
            amay8.a |= 2;
        } else if (i2 != 3) {
            a.b("ImpressionLogEvent", "Unknown role type code: %d", Integer.valueOf(i2));
            if (o.c) {
                o.c();
                o.c = false;
            }
            amay amay9 = (amay) o.b;
            amay9.c = 0;
            amay9.a |= 2;
        } else {
            amay amay10 = (amay) o.b;
            amay10.c = 4;
            amay10.a |= 2;
        }
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amay amay11 = (amay) o.i();
        ambk ambk2 = ambk.K;
        amay11.getClass();
        ambk.C = amay11;
        ambk.a |= 67108864;
    }

    public final /* bridge */ /* synthetic */ void c(int i, int i2) {
        int i3;
        k();
        iva.a(!((((ambk) this.e.b).a & 64) != 0), (Object) "Can't call setType() twice");
        if (i == 0) {
            aucd aucd = this.e;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambk ambk = (ambk) aucd.b;
            ambk ambk2 = ambk.K;
            ambk.i = 1;
            ambk.a |= 64;
        } else if (i == 1) {
            aucd aucd2 = this.e;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ambk ambk3 = (ambk) aucd2.b;
            ambk ambk4 = ambk.K;
            ambk3.i = 2;
            ambk3.a |= 64;
        } else if (i == 2) {
            aucd aucd3 = this.e;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            ambk ambk5 = (ambk) aucd3.b;
            ambk ambk6 = ambk.K;
            ambk5.i = 3;
            ambk5.a |= 64;
        } else if (i != 3) {
            aucd aucd4 = this.e;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            ambk ambk7 = (ambk) aucd4.b;
            ambk ambk8 = ambk.K;
            ambk7.i = 5;
            ambk7.a |= 64;
        } else {
            aucd aucd5 = this.e;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            ambk ambk9 = (ambk) aucd5.b;
            ambk ambk10 = ambk.K;
            ambk9.i = 4;
            ambk9.a |= 64;
        }
        switch (i2) {
            case 0:
                i3 = 1326;
                break;
            case 1:
                i3 = 1327;
                break;
            case 2:
                i3 = 1328;
                break;
            case 3:
                i3 = 1329;
                break;
            case 4:
                i3 = 1330;
                break;
            case 5:
                i3 = 1331;
                break;
            case 6:
                i3 = 1332;
                break;
            case 7:
                i3 = 1333;
                break;
            case 8:
                i3 = 1334;
                break;
            case 9:
                i3 = 1335;
                break;
            case 10:
                i3 = 1336;
                break;
            case 11:
                i3 = 1337;
                break;
            case 12:
                i3 = 1338;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                i3 = 1339;
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                i3 = 1340;
                break;
            case Service.START_CONTINUATION_MASK:
                i3 = 1341;
                break;
            case 16:
                i3 = 1342;
                break;
            case 17:
                i3 = 1343;
                break;
            case 18:
                i3 = 1344;
                break;
            case 19:
                i3 = 1345;
                break;
            case 20:
                i3 = 1346;
                break;
            case 21:
                i3 = 1347;
                break;
            case 22:
                i3 = 1348;
                break;
            case 23:
                i3 = 1349;
                break;
            case 24:
                i3 = 1350;
                break;
            case 25:
                i3 = 1351;
                break;
            case 26:
                i3 = 1352;
                break;
            case 27:
                i3 = 1353;
                break;
            case 28:
                i3 = 1354;
                break;
            case 29:
                i3 = 1355;
                break;
            case 30:
                i3 = 1356;
                break;
            case 31:
                i3 = 1357;
                break;
            case 32:
                i3 = 1363;
                break;
            case 33:
                i3 = 1545;
                break;
            case 35:
                i3 = 1555;
                break;
            case 36:
                i3 = 1559;
                break;
            case 37:
                i3 = 1557;
                break;
            case 38:
                i3 = 1547;
                break;
            case 39:
                i3 = 1692;
                break;
            case 40:
                i3 = 1701;
                break;
            case 41:
                i3 = 1702;
                break;
            case 42:
                i3 = 1703;
                break;
            case 43:
                i3 = 1704;
                break;
            case 44:
                i3 = 1706;
                break;
            case 45:
                i3 = 1825;
                break;
            case 46:
                i3 = 1826;
                break;
            case 47:
                i3 = 1827;
                break;
            case 48:
                i3 = 1854;
                break;
            case 49:
                i3 = 1855;
                break;
            case 50:
                i3 = 1856;
                break;
            case 51:
                i3 = 1857;
                break;
            case 52:
                i3 = 1879;
                break;
            case 53:
                i3 = 1880;
                break;
            case 54:
                i3 = 1865;
                break;
            case 55:
                i3 = 1888;
                break;
            case 56:
                i3 = 1935;
                break;
            case 57:
                i3 = 1931;
                break;
            case 58:
                i3 = 1932;
                break;
            case 59:
                i3 = 1933;
                break;
            case 60:
                i3 = 1934;
                break;
            case 61:
                i3 = 1940;
                break;
            case 62:
                i3 = 2107;
                break;
            case 63:
                i3 = 2147;
                break;
            case 64:
                i3 = 2228;
                break;
            case 65:
                i3 = 2279;
                break;
            case 66:
                i3 = 2280;
                break;
            case 67:
                i3 = 2322;
                break;
            case 68:
                i3 = 2306;
                break;
            case 69:
                i3 = 2353;
                break;
            case 70:
                i3 = 2354;
                break;
            case 71:
                i3 = 2355;
                break;
            default:
                a.b("ImpressionLogEvent", "Unknown event code: %d", Integer.valueOf(i2));
                i3 = 1005;
                break;
        }
        this.b.a(i3);
    }

    public final lfj b() {
        return new lfw(this.e);
    }

    public final /* bridge */ /* synthetic */ void b(int i) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 512) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setOpenMode() twice");
        if (i == 268435456) {
            aucd aucd = this.e;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambk ambk = (ambk) aucd.b;
            ambk ambk2 = ambk.K;
            ambk.l = 1;
            ambk.a |= 512;
        } else if (i == 536870912) {
            aucd aucd2 = this.e;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ambk ambk3 = (ambk) aucd2.b;
            ambk ambk4 = ambk.K;
            ambk3.l = 2;
            ambk3.a |= 512;
        } else if (i != 805306368) {
            a.b("ImpressionLogEvent", "Unknown open mode: %d", Integer.valueOf(i));
            aucd aucd3 = this.e;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            ambk ambk5 = (ambk) aucd3.b;
            ambk ambk6 = ambk.K;
            ambk5.l = 0;
            ambk5.a |= 512;
        } else {
            aucd aucd4 = this.e;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            ambk ambk7 = (ambk) aucd4.b;
            ambk ambk8 = ambk.K;
            ambk7.l = 3;
            ambk7.a |= 512;
        }
    }

    public final void b(int i, int i2) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 32768) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setRecursiveActionDetails() twice");
        aucd aucd = this.e;
        aucd o = ambc.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ambc ambc = (ambc) o.b;
        int i3 = 1 | ambc.a;
        ambc.a = i3;
        ambc.b = i;
        ambc.a = i3 | 2;
        ambc.c = i2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambc ambc2 = (ambc) o.i();
        ambk ambk2 = ambk.K;
        ambc2.getClass();
        ambk.r = ambc2;
        ambk.a |= 32768;
    }

    public final void a(int i, int i2, int i3, Long l) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 8388608) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setTombstonePurgeDetails() twice");
        aucd o = ambg.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ambg ambg = (ambg) o.b;
        int i4 = 1 | ambg.a;
        ambg.a = i4;
        ambg.b = i;
        int i5 = i4 | 2;
        ambg.a = i5;
        ambg.c = i2;
        ambg.a = i5 | 4;
        ambg.d = i3;
        if (l != null) {
            long longValue = l.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ambg ambg2 = (ambg) o.b;
            ambg2.a |= 8;
            ambg2.e = longValue;
        }
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambg ambg3 = (ambg) o.i();
        ambk ambk2 = ambk.K;
        ambg3.getClass();
        ambk.z = ambg3;
        ambk.a |= 8388608;
    }

    public final void b(int i, long j) {
        boolean z;
        k();
        if (((((ambk) this.e.b).b & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Can't call setUnsubscribedItemSyncDetails() twice");
        aucd aucd = this.e;
        aucd o = ambh.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ambh ambh = (ambh) o.b;
        int i2 = ambh.a | 1;
        ambh.a = i2;
        ambh.b = i;
        ambh.a = i2 | 2;
        ambh.c = j;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambh ambh2 = (ambh) o.i();
        ambk ambk2 = ambk.K;
        ambh2.getClass();
        ambk.I = ambh2;
        ambk.b |= 1;
    }

    public final void a(int i, int i2, Long l, lgw lgw) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & Integer.MIN_VALUE) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setDownloadDetails() twice");
        aucd o = amas.f.o();
        if (i != 2) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas = (amas) o.b;
            amas.b = 0;
            amas.a |= 1;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas2 = (amas) o.b;
            amas2.b = 3;
            amas2.a |= 1;
        }
        switch (i2) {
            case 2:
                amas amas3 = (amas) o.b;
                amas3.c = 1;
                amas3.a |= 2;
                break;
            case 3:
                amas amas4 = (amas) o.b;
                amas4.c = 2;
                amas4.a |= 2;
                break;
            case 4:
                amas amas5 = (amas) o.b;
                amas5.c = 3;
                amas5.a |= 2;
                break;
            case 5:
                amas amas6 = (amas) o.b;
                amas6.c = 4;
                amas6.a |= 2;
                break;
            case 6:
                amas amas7 = (amas) o.b;
                amas7.c = 5;
                amas7.a |= 2;
                break;
            case 7:
                amas amas8 = (amas) o.b;
                amas8.c = 6;
                amas8.a |= 2;
                break;
            case 8:
                amas amas9 = (amas) o.b;
                amas9.c = 7;
                amas9.a |= 2;
                break;
            default:
                amas amas10 = (amas) o.b;
                amas10.c = 0;
                amas10.a |= 2;
                a.b("ImpressionLogEvent", "Unable to log download state: %d", Integer.valueOf(i2));
                break;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas11 = (amas) o.b;
            amas11.a |= 4;
            amas11.d = longValue;
        }
        lgw lgw2 = lgw.DISCONNECTED;
        kaj kaj = kaj.NULL;
        int ordinal = lgw.ordinal();
        if (ordinal == 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas12 = (amas) o.b;
            amas12.e = 1;
            amas12.a |= 8;
        } else if (ordinal == 1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas13 = (amas) o.b;
            amas13.e = 2;
            amas13.a |= 8;
        } else if (ordinal == 2) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas14 = (amas) o.b;
            amas14.e = 3;
            amas14.a |= 8;
        } else if (ordinal != 3) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas15 = (amas) o.b;
            amas15.e = 0;
            amas15.a |= 8;
            a.b("ImpressionLogEvent", "Unknown network type: %s", lgw);
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amas amas16 = (amas) o.b;
            amas16.e = 4;
            amas16.a |= 8;
        }
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amas amas17 = (amas) o.i();
        ambk ambk2 = ambk.K;
        amas17.getClass();
        ambk.H = amas17;
        ambk.a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public final void a(CallingAppInfo callingAppInfo) {
        k();
        boolean z = true;
        if (((((ambk) this.e.b).a & 1) ^ 1) == 0) {
            z = false;
        }
        iva.a(z, (Object) "Can't call setAppInfo() twice");
        lfj b2 = b();
        b2.a(callingAppInfo.b);
        b2.b(callingAppInfo.a);
        b2.a(callingAppInfo.c);
        b2.a();
    }

    /* renamed from: b */
    public final void a(String str) {
        k();
        iva.a(this.d == null, (Object) "Can't call setAccountName() twice");
        iva.a((Object) str);
        this.d = str;
    }

    public final void a(int i, long j) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setRecursiveActionCleanupDetails() twice");
        aucd aucd = this.e;
        aucd o = ambb.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ambb ambb = (ambb) o.b;
        int i2 = 1 | ambb.a;
        ambb.a = i2;
        ambb.b = i;
        ambb.a = i2 | 2;
        ambb.c = j;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambb ambb2 = (ambb) o.i();
        ambk ambk2 = ambk.K;
        ambb2.getClass();
        ambk.w = ambb2;
        ambk.a |= 1048576;
    }

    public final /* bridge */ /* synthetic */ void a(long j, long j2) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setDeviceStatus() twice");
        aucd aucd = this.e;
        aucd o = amar.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amar amar = (amar) o.b;
        int i = 1 | amar.a;
        amar.a = i;
        amar.b = j;
        amar.a = i | 2;
        amar.c = j2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amar amar2 = (amar) o.i();
        ambk ambk2 = ambk.K;
        amar2.getClass();
        ambk.e = amar2;
        ambk.a |= 4;
    }

    public final /* bridge */ /* synthetic */ void a(MetadataBundle metadataBundle) {
        boolean z;
        k();
        boolean z2 = true;
        if ((((ambk) this.e.b).a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setMetadataUpdate() twice");
        aucd o = amax.e.o();
        Boolean bool = (Boolean) metadataBundle.a((kyq) lce.M);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amax amax = (amax) o.b;
            amax.a |= 1;
            amax.b = booleanValue;
        }
        if (metadataBundle.a(lce.E) == null) {
            z2 = false;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        amax amax2 = (amax) o.b;
        amax2.a |= 2;
        amax2.c = z2;
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) metadataBundle.a((kyq) lce.L);
        if (appVisibleCustomProperties == null) {
            appVisibleCustomProperties = AppVisibleCustomProperties.a;
        }
        Iterator it = appVisibleCustomProperties.iterator();
        int i = 2;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((CustomProperty) it.next()).a.b == 0) {
                if (i == 2) {
                    i = 3;
                } else if (i == 4) {
                    i = 5;
                    break;
                }
            } else if (i == 2) {
                i = 4;
            } else if (i == 3) {
                i = 5;
                break;
            }
        }
        aucd aucd = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        amax amax3 = (amax) o.b;
        amax3.d = i - 1;
        amax3.a = 4 | amax3.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amax amax4 = (amax) o.i();
        ambk ambk2 = ambk.K;
        amax4.getClass();
        ambk.k = amax4;
        ambk.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public final /* bridge */ /* synthetic */ void a(Query query, boolean z, Integer num, Boolean bool, Integer num2) {
        boolean z2;
        k();
        if ((((ambk) this.e.b).a & 16384) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(!z2, (Object) "Can't call setQueryDetails() twice");
        aucd o = amba.g.o();
        Set<ambp> set = (Set) query.a.a(new lgb(this));
        ArrayList arrayList = new ArrayList(set.size());
        for (ambp ambp : set) {
            if (ambp == null) {
                arrayList.add(ambp.UNKNOWN_METADATA_FIELD);
            } else {
                arrayList.add(ambp);
            }
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        amba amba = (amba) o.b;
        if (!amba.b.a()) {
            amba.b = aucj.a(amba.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            amba.b.d(((ambp) arrayList.get(i)).o);
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        amba amba2 = (amba) o.b;
        amba2.a |= 2;
        amba2.c = z;
        if (num != null) {
            int intValue = num.intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amba amba3 = (amba) o.b;
            amba3.a |= 4;
            amba3.d = intValue;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amba amba4 = (amba) o.b;
            amba4.a |= 8;
            amba4.e = booleanValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 == 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amba amba5 = (amba) o.b;
                amba5.f = 1;
                amba5.a |= 16;
            } else if (intValue2 != 1) {
                a.b("ImpressionLogEvent", "Unknown query status: %d", num2);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amba amba6 = (amba) o.b;
                amba6.f = 0;
                amba6.a |= 16;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amba amba7 = (amba) o.b;
                amba7.f = 2;
                amba7.a |= 16;
            }
        }
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amba amba8 = (amba) o.i();
        ambk ambk2 = ambk.K;
        amba8.getClass();
        ambk.q = amba8;
        ambk.a |= 16384;
    }

    public final void a(String str, boolean z, String str2) {
        boolean z2;
        k();
        if ((((ambk) this.e.b).a & 2048) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(!z2, (Object) "Can't call setResourceInfo() twice");
        aucd o = ambd.e.o();
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ambd ambd = (ambd) o.b;
            str.getClass();
            ambd.a = 1 | ambd.a;
            ambd.b = str;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        ambd ambd2 = (ambd) o.b;
        int i = ambd2.a | 4;
        ambd2.a = i;
        ambd2.d = z;
        if (str2 != null) {
            str2.getClass();
            ambd2.a = i | 2;
            ambd2.c = str2;
        }
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambd ambd3 = (ambd) o.i();
        ambk ambk2 = ambk.K;
        ambd3.getClass();
        ambk.n = ambd3;
        ambk.a |= 2048;
    }

    public final /* bridge */ /* synthetic */ void a(jzr jzr) {
        boolean z;
        String str = jzr.a().a;
        Boolean bool = (Boolean) jzr.a(lce.j);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        a(str, z, jzr.c());
    }

    public final void a(kaj kaj) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 524288) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setActionType() twice");
        aucd aucd = this.e;
        alzy b2 = b(kaj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        ambk.v = b2.p;
        ambk.a |= 524288;
    }

    public final /* bridge */ /* synthetic */ void a(kmp kmp) {
        a(kmp.i(), kmp.ai(), kmp.H());
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(defpackage.ksp r13, int r14, int r15) {
        /*
            r12 = this;
            r12.k()
            aucd r0 = r12.e
            aucj r0 = r0.b
            ambk r0 = (defpackage.ambk) r0
            int r0 = r0.a
            r1 = 2
            r0 = r0 & r1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r0 = r0 ^ r3
            java.lang.String r4 = "Can't call setCompletionEventDetails() twice"
            defpackage.iva.a((boolean) r0, (java.lang.Object) r4)
            amao r0 = defpackage.amao.g
            aucd r0 = r0.o()
            r4 = 3
            r5 = 4
            if (r13 == 0) goto L_0x00f3
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r7 = r13.h
            int r7 = r7.size()
            r6.<init>(r7)
            java.util.List r7 = r13.h
            java.util.Iterator r7 = r7.iterator()
        L_0x0035:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0049
            java.lang.Object r8 = r7.next()
            kaj r8 = (defpackage.kaj) r8
            alzy r8 = b((defpackage.kaj) r8)
            r6.add(r8)
            goto L_0x0035
        L_0x0049:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r0.c()
            r0.c = r2
        L_0x0053:
            aucj r7 = r0.b
            amao r7 = (defpackage.amao) r7
            aucs r8 = defpackage.aucj.q()
            r7.d = r8
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r0.c()
            r0.c = r2
        L_0x0067:
            aucj r7 = r0.b
            amao r7 = (defpackage.amao) r7
            aucs r8 = r7.d
            boolean r8 = r8.a()
            if (r8 != 0) goto L_0x007b
            aucs r8 = r7.d
            aucs r8 = defpackage.aucj.a((defpackage.aucs) r8)
            r7.d = r8
        L_0x007b:
            int r8 = r6.size()
            r9 = 0
        L_0x0080:
            if (r9 >= r8) goto L_0x0092
            java.lang.Object r10 = r6.get(r9)
            alzy r10 = (defpackage.alzy) r10
            aucs r11 = r7.d
            int r10 = r10.p
            r11.d(r10)
            int r9 = r9 + 1
            goto L_0x0080
        L_0x0092:
            java.util.List r6 = r13.g
            int r6 = r6.size()
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r0.c()
            r0.c = r2
        L_0x00a2:
            aucj r7 = r0.b
            amao r7 = (defpackage.amao) r7
            int r8 = r7.a
            r8 = r8 | r1
            r7.a = r8
            r7.c = r6
            int r6 = r13.i
            if (r6 == 0) goto L_0x00ed
            if (r6 == r3) goto L_0x00ea
            if (r6 == r1) goto L_0x00e7
            if (r6 == r4) goto L_0x00e4
            ith r6 = a
            java.lang.Object[] r7 = new java.lang.Object[r1]
            int r13 = r13.i
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7[r2] = r13
            android.content.Context r13 = r12.c
            r7[r3] = r13
            java.lang.String r13 = "ImpressionLogEvent"
            java.lang.String r8 = "Unknown completion event status (%d) in %s"
            r6.b((java.lang.String) r13, (java.lang.String) r8, (java.lang.Object[]) r7)
            boolean r13 = r0.c
            if (r13 != 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            r0.c()
            r0.c = r2
        L_0x00d8:
            aucj r13 = r0.b
            amao r13 = (defpackage.amao) r13
            r13.b = r2
            int r6 = r13.a
            r6 = r6 | r3
            r13.a = r6
            goto L_0x00f3
        L_0x00e4:
            r7.b = r5
            goto L_0x00ef
        L_0x00e7:
            r7.b = r4
            goto L_0x00ef
        L_0x00ea:
            r7.b = r1
            goto L_0x00ef
        L_0x00ed:
            r7.b = r3
        L_0x00ef:
            r13 = r8 | 1
            r7.a = r13
        L_0x00f3:
            boolean r13 = r0.c
            if (r13 != 0) goto L_0x00f8
            goto L_0x00fd
        L_0x00f8:
            r0.c()
            r0.c = r2
        L_0x00fd:
            aucj r13 = r0.b
            amao r13 = (defpackage.amao) r13
            int r6 = r13.a
            r6 = r6 | 8
            r13.a = r6
            r13.f = r14
            if (r15 == 0) goto L_0x0117
            if (r15 == r3) goto L_0x0114
            r13.e = r4
            r14 = r6 | 4
            r13.a = r14
            goto L_0x011d
        L_0x0114:
            r13.e = r1
            goto L_0x0119
        L_0x0117:
            r13.e = r3
        L_0x0119:
            r14 = r6 | 4
            r13.a = r14
        L_0x011d:
            aucd r13 = r12.e
            boolean r14 = r13.c
            if (r14 != 0) goto L_0x0124
            goto L_0x0129
        L_0x0124:
            r13.c()
            r13.c = r2
        L_0x0129:
            aucj r13 = r13.b
            ambk r13 = (defpackage.ambk) r13
            aucj r14 = r0.i()
            amao r14 = (defpackage.amao) r14
            ambk r15 = defpackage.ambk.K
            r14.getClass()
            r13.d = r14
            int r14 = r13.a
            r14 = r14 | r1
            r13.a = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgc.a(ksp, int, int):void");
    }

    public final void a(ldf ldf) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 65536) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setActivityLevel() twice");
        aucd aucd = this.e;
        int b2 = b(ldf);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        ambk.s = b2 - 1;
        ambk.a |= 65536;
    }

    public final void a(ldf ldf, long j) {
        boolean z;
        k();
        if ((((ambk) this.e.b).a & 262144) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setActivityLevelChangeDetails() twice");
        aucd aucd = this.e;
        aucd o = amam.d.o();
        int b2 = b(ldf);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amam amam = (amam) o.b;
        amam.b = b2 - 1;
        int i = amam.a | 1;
        amam.a = i;
        amam.a = i | 2;
        amam.c = j;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amam amam2 = (amam) o.i();
        ambk ambk2 = ambk.K;
        amam2.getClass();
        ambk.u = amam2;
        ambk.a |= 262144;
    }

    public final /* bridge */ /* synthetic */ void a(boolean z) {
        boolean z2;
        k();
        if ((((ambk) this.e.b).a & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(!z2, (Object) "Can't call setIsCached() twice");
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        ambk.a |= 128;
        ambk.j = z;
    }

    public final /* bridge */ /* synthetic */ void a(boolean z, String str) {
        a((String) null, z, str);
    }

    public final /* bridge */ /* synthetic */ void a(boolean z, boolean z2, Integer num) {
        boolean z3;
        int i;
        k();
        if ((((ambk) this.e.b).a & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.a(!z3, (Object) "Can't call setExecutionOptions() twice");
        aucd o = amat.e.o();
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                i = 2;
            } else if (intValue != 1) {
                a.b("ImpressionLogEvent", "Unknown conflict strategy: %s", num);
                i = 1;
            } else {
                i = 3;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            amat amat = (amat) o.b;
            amat.d = i - 1;
            amat.a |= 4;
        }
        aucd aucd = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        amat amat2 = (amat) o.b;
        int i2 = 1 | amat2.a;
        amat2.a = i2;
        amat2.b = z2;
        amat2.a = i2 | 2;
        amat2.c = z;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amat amat3 = (amat) o.i();
        ambk ambk2 = ambk.K;
        amat3.getClass();
        ambk.g = amat3;
        ambk.a |= 16;
    }
}
