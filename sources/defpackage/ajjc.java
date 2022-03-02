package defpackage;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ajjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjc {
    private static final anaf a;
    private static final anaf b;
    private final hol c = new hol(this.d, "USER_LOCATION_REPORTING", (String) null);
    private final Context d;
    private final IntentFilter e = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private Map f;

    static {
        anab h = anaf.h();
        h.a("com.google.android.gms", atex.ACR_GCORE);
        h.a("com.google.android.gms.udc", atex.ACR_UDC);
        h.a("com.google.android.apps.fitness", atex.ACR_GOOGLE_HEART);
        h.a("com.google.android.googlequicksearchbox", atex.ACR_GOOGLE_NOW);
        h.a("com.google.android.apps.photos", atex.ACR_GOOGLE_PHOTOS);
        h.a("com.google.android.apps.plus", atex.ACR_GOOGLE_PLUS);
        h.a("com.google.android.gm", atex.ACR_GMAIL);
        h.a("com.google.android.apps.maps", atex.ACR_GMM);
        h.a("com.google.android.apps.gmm", atex.ACR_GMM_DOGFOOD);
        h.a("com.google.android.apps.gmm.fishfood", atex.ACR_GMM_FISHFOOD);
        h.a("com.google.android.apps.gmm.dev", atex.ACR_GMM_DEV);
        h.a("com.google.android.apps.gmm.qp", atex.ACR_GMM_QP);
        h.a("com.ridewith", atex.ACR_RIDE_WITH);
        h.a("com.google.android.apps.mahlzeit", atex.ACR_WAITING_TIME);
        h.a("com.google.android.apps.kids.familylink", atex.ACR_FAMILY_COMPASS);
        h.a("com.waze", atex.ACR_WAZE);
        h.a("com.google.android.apps.emergencyassist", atex.ACR_EMERGENCY_ASSIST);
        h.a("com.google.android.apps.ridematch", atex.ACR_RIDEMATCH);
        h.a("com.google.android.apps.ridematch.us", atex.ACR_RIDEMATCH_US);
        h.a("com.google.android.apps.tycho", atex.ACR_TYCHO);
        h.a("com.google.android.apps.youtube.music", atex.ACR_YOUTUBE_MUSIC);
        a = h.a();
        anab h2 = anaf.h();
        h2.a(atev.AC_UNKNOWN, atfh.API_CALL_UNKNOWN);
        h2.a(atev.AC_GET_REPORTING_STATE_SAFE, atfh.API_CALL_GET_REPORTING_STATE_SAFE);
        h2.a(atev.AC_TRY_OPT_IN, atfh.API_CALL_TRY_OPT_IN);
        h2.a(atev.AC_TRY_OPT_IN_REQUEST, atfh.API_CALL_TRY_OPT_IN_REQUEST);
        h2.a(atev.AC_REQUEST_UPLOAD, atfh.API_CALL_REQUEST_UPLOAD);
        h2.a(atev.AC_CANCEL_UPLOAD, atfh.API_CALL_CANCEL_UPLOAD);
        h2.a(atev.AC_REPORT_PLACE, atfh.API_CALL_REPORT_PLACE);
        h2.a(atev.AC_SEND_DATA, atfh.API_CALL_SEND_DATA);
        h2.a(atev.AC_PRIVATE_MODE_TOGGLE_ON, atfh.API_CALL_TOGGLE_PRIVATE_MODE_ON);
        h2.a(atev.AC_PRIVATE_MODE_TOGGLE_OFF, atfh.API_CALL_TOGGLE_PRIVATE_MODE_OFF);
        b = h2.a();
    }

    public ajjc(Context context) {
        this.d = context.getApplicationContext();
    }

    private final synchronized void a(atfh atfh, asyx asyx, String str) {
        hoi a2 = this.c.a(asyx.k());
        a2.b(atfh.dy);
        a2.c(str);
        a2.b();
    }

    static final aucd b(atev atev, String str, String str2, int i) {
        aucd o = asvn.k.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asvn asvn = (asvn) o.b;
        asvn.d = atev.m;
        asvn.a |= 1;
        if (str != null) {
            atex atex = (atex) a.get(str);
            if (atex == null) {
                atex atex2 = atex.ACR_UNKNOWN;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asvn asvn2 = (asvn) o.b;
                asvn2.e = atex2.w;
                asvn2.a |= 2;
                int hashCode = str.hashCode();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asvn asvn3 = (asvn) o.b;
                asvn3.a |= 4;
                asvn3.f = hashCode;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asvn asvn4 = (asvn) o.b;
                asvn4.e = atex.w;
                asvn4.a |= 2;
            }
        }
        if (str2 != null) {
            asvn asvn5 = (asvn) o.b;
            asvn5.a |= 8;
            asvn5.g = true;
            atex atex3 = (atex) a.get(str2);
            if (atex3 == null) {
                atex atex4 = atex.ACR_UNKNOWN;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asvn asvn6 = (asvn) o.b;
                asvn6.h = atex4.w;
                asvn6.a |= 16;
                int hashCode2 = str2.hashCode();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asvn asvn7 = (asvn) o.b;
                asvn7.a |= 32;
                asvn7.i = hashCode2;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asvn asvn8 = (asvn) o.b;
                asvn8.h = atex3.w;
                asvn8.a |= 16;
            }
        } else {
            asvn asvn9 = (asvn) o.b;
            asvn9.a |= 8;
            asvn9.g = false;
        }
        asvn asvn10 = (asvn) o.b;
        asvn10.a |= 64;
        asvn10.j = i;
        return o;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(int i) {
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 3;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        asyo.c = 2;
        int i3 = i2 | 2;
        asyo.a = i3;
        int i4 = i - 1;
        if (i != 0) {
            asyo.d = i4;
            asyo.a = i3 | 4;
            asyo asyo2 = (asyo) o.i();
            atfh atfh = atfh.RPC_GET_USER_SETTINGS_FAILURE;
            aucd o2 = asyx.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asyx asyx = (asyx) o2.b;
            asyo2.getClass();
            asyx.c = asyo2;
            asyx.b = 93;
            a(atfh, o2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d(int i) {
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 5;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        asyo.c = 2;
        int i3 = i2 | 2;
        asyo.a = i3;
        int i4 = i - 1;
        if (i != 0) {
            asyo.d = i4;
            asyo.a = i3 | 4;
            asyo asyo2 = (asyo) o.i();
            atfh atfh = atfh.RPC_REPORT_LOCATIONS_FAILURE;
            aucd o2 = asyx.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asyx asyx = (asyx) o2.b;
            asyo2.getClass();
            asyx.c = asyo2;
            asyx.b = 93;
            a(atfh, o2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(int i) {
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 4;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        asyo.c = 2;
        int i3 = i2 | 2;
        asyo.a = i3;
        int i4 = i - 1;
        if (i != 0) {
            asyo.d = i4;
            asyo.a = i3 | 4;
            asyo asyo2 = (asyo) o.i();
            atfh atfh = atfh.RPC_SET_REMOTE_DEVICE_SETTINGS_FAILURE;
            aucd o2 = asyx.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asyx asyx = (asyx) o2.b;
            asyo2.getClass();
            asyx.c = asyo2;
            asyx.b = 93;
            a(atfh, o2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void f(int i) {
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 2;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        asyo.c = 2;
        int i3 = 2 | i2;
        asyo.a = i3;
        int i4 = i - 1;
        if (i != 0) {
            asyo.d = i4;
            asyo.a = i3 | 4;
            asyo asyo2 = (asyo) o.i();
            atfh atfh = atfh.RPC_SET_SETTINGS_FAILURE;
            aucd o2 = asyx.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asyx asyx = (asyx) o2.b;
            asyo2.getClass();
            asyx.c = asyo2;
            asyx.b = 93;
            a(atfh, o2);
        } else {
            throw null;
        }
    }

    public final synchronized void g(boolean z) {
        aucd o = aswj.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aswj aswj = (aswj) o.b;
        aswj.a |= 1;
        aswj.b = z;
        aswj aswj2 = (aswj) o.i();
        atfh atfh = atfh.DEEP_STILL_CHANGED;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        aswj2.getClass();
        asyx.c = aswj2;
        asyx.b = 102;
        a(atfh, o2);
    }

    public final synchronized void h(boolean z) {
        atfh atfh;
        aucd o = asyx.e.o();
        if (!z) {
            aswm aswm = aswm.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyx asyx = (asyx) o.b;
            aswm.getClass();
            asyx.c = aswm;
            asyx.b = 85;
            atfh = atfh.DISABLE_LR_SUCCESS;
        } else {
            aswr aswr = aswr.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyx asyx2 = (asyx) o.b;
            aswr.getClass();
            asyx2.c = aswr;
            asyx2.b = 84;
            atfh = atfh.ENABLE_LR_SUCCESS;
        }
        a(atfh, o);
    }

    public final synchronized void i(boolean z) {
        atfh atfh;
        aucd o = asyx.e.o();
        if (!z) {
            aswl aswl = aswl.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyx asyx = (asyx) o.b;
            aswl.getClass();
            asyx.c = aswl;
            asyx.b = 83;
            atfh = atfh.DISABLE_LH_SUCCESS;
        } else {
            aswq aswq = aswq.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyx asyx2 = (asyx) o.b;
            aswq.getClass();
            asyx2.c = aswq;
            asyx2.b = 82;
            atfh = atfh.ENABLE_LH_SUCCESS;
        }
        a(atfh, o);
    }

    private final synchronized void a(atfh atfh, aucd aucd) {
        aucd o = asyy.h.o();
        int a2 = jhh.a(this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyy asyy = (asyy) o.b;
        int i = asyy.a | 16;
        asyy.a = i;
        asyy.b = a2;
        asyy.a = i | 32;
        asyy.c = 0;
        Intent registerReceiver = this.d.registerReceiver((BroadcastReceiver) null, this.e);
        int i2 = 3;
        if (registerReceiver != null) {
            int round = Math.round(((float) (registerReceiver.getIntExtra("level", -1) * 100)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyy asyy2 = (asyy) o.b;
            asyy2.a |= 131072;
            asyy2.e = round;
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy3 = (asyy) o.b;
                asyy3.f = 2;
                asyy3.a = 262144 | asyy3.a;
            } else if (intExtra == 3) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy4 = (asyy) o.b;
                asyy4.f = 1;
                asyy4.a = 262144 | asyy4.a;
            } else if (intExtra == 4) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy5 = (asyy) o.b;
                asyy5.f = 4;
                asyy5.a = 262144 | asyy5.a;
            } else if (intExtra != 5) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy6 = (asyy) o.b;
                asyy6.f = 0;
                asyy6.a = 262144 | asyy6.a;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy7 = (asyy) o.b;
                asyy7.f = 3;
                asyy7.a = 262144 | asyy7.a;
            }
            int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
            if (intExtra2 == 1) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy8 = (asyy) o.b;
                asyy8.g = 3;
                asyy8.a = 524288 | asyy8.a;
            } else if (intExtra2 == 2) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy9 = (asyy) o.b;
                asyy9.g = 2;
                asyy9.a = 524288 | asyy9.a;
            } else if (intExtra2 != 4) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy10 = (asyy) o.b;
                asyy10.g = 0;
                asyy10.a = 524288 | asyy10.a;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asyy asyy11 = (asyy) o.b;
                asyy11.g = 4;
                asyy11.a = 524288 | asyy11.a;
            }
        }
        PowerManager powerManager = (PowerManager) this.d.getSystemService("power");
        if (powerManager != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (powerManager.isPowerSaveMode()) {
                i2 = 2;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyy asyy12 = (asyy) o.b;
            asyy12.d = i2 - 1;
            asyy12.a |= 65536;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyy asyy13 = (asyy) o.b;
            asyy13.d = 0;
            asyy13.a |= 65536;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        asyx asyx = (asyx) aucd.b;
        asyy asyy14 = (asyy) o.i();
        asyx asyx2 = asyx.e;
        asyy14.getClass();
        asyx.d = asyy14;
        asyx.a |= 1;
        hoi a3 = this.c.a(((asyx) aucd.i()).k());
        a3.b(atfh.dy);
        a3.b();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(long j) {
        aucd o = asyn.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyn asyn = (asyn) o.b;
        int i = asyn.a | 2;
        asyn.a = i;
        asyn.e = j;
        asyn.d = 2;
        asyn.a = i | 1;
        asyn asyn2 = (asyn) o.i();
        atfh atfh = atfh.RPC_SET_SETTINGS_REQUEST;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyn2.getClass();
        asyx.c = asyn2;
        asyx.b = 92;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d(long j) {
        aucd o = asyn.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyn asyn = (asyn) o.b;
        int i = asyn.a | 2;
        asyn.a = i;
        asyn.e = j;
        asyn.d = 3;
        asyn.a = i | 1;
        asyn asyn2 = (asyn) o.i();
        atfh atfh = atfh.RPC_GET_USER_SETTINGS_REQUEST;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyn2.getClass();
        asyx.c = asyn2;
        asyx.b = 92;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(long j) {
        aucd o = asyn.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyn asyn = (asyn) o.b;
        int i = asyn.a | 2;
        asyn.a = i;
        asyn.e = j;
        asyn.d = 4;
        asyn.a = i | 1;
        asyn asyn2 = (asyn) o.i();
        atfh atfh = atfh.RPC_SET_REMOTE_DEVICE_SETTINGS_REQUEST;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyn2.getClass();
        asyx.c = asyn2;
        asyx.b = 92;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void f(boolean z) {
        int i;
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 4;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        asyo.c = i - 1;
        asyo.a = i2 | 2;
        asyo asyo2 = (asyo) o.i();
        atfh atfh = z ? atfh.RPC_SET_REMOTE_DEVICE_SETTINGS_SUCCESS : atfh.RPC_SET_REMOTE_DEVICE_SETTINGS_FAILURE;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyo2.getClass();
        asyx.c = asyo2;
        asyx.b = 93;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(boolean z) {
        int i;
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 1;
        int i2 = 1 | asyo.a;
        asyo.a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        asyo.c = i - 1;
        asyo.a = i2 | 2;
        asyo asyo2 = (asyo) o.i();
        atfh atfh = !z ? atfh.RPC_GET_SETTINGS_FAILURE : atfh.RPC_GET_SETTINGS_SUCCESS;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyo2.getClass();
        asyx.c = asyo2;
        asyx.b = 93;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d(boolean z) {
        int i;
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 2;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        asyo.c = i - 1;
        asyo.a = 2 | i2;
        asyo asyo2 = (asyo) o.i();
        atfh atfh = !z ? atfh.RPC_SET_SETTINGS_FAILURE : atfh.RPC_SET_SETTINGS_SUCCESS;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyo2.getClass();
        asyx.c = asyo2;
        asyx.b = 93;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(boolean z) {
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        int i = 3;
        asyo.b = 3;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        if (z) {
            i = 2;
        }
        asyo.c = i - 1;
        asyo.a = i2 | 2;
        asyo asyo2 = (asyo) o.i();
        atfh atfh = z ? atfh.RPC_GET_USER_SETTINGS_SUCCESS : atfh.RPC_GET_USER_SETTINGS_FAILURE;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyo2.getClass();
        asyx.c = asyo2;
        asyx.b = 93;
        a(atfh, o2);
    }

    private final synchronized List b(Boolean bool) {
        List list;
        if (this.f == null) {
            this.f = new HashMap(3);
        }
        list = (List) this.f.get(bool);
        if (list == null) {
            list = new ArrayList();
            this.f.put(bool, list);
        }
        return list;
    }

    private final synchronized void b() {
        for (List clear : this.f.values()) {
            clear.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i) {
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 1;
        int i2 = 1 | asyo.a;
        asyo.a = i2;
        asyo.c = 2;
        int i3 = i2 | 2;
        asyo.a = i3;
        int i4 = i - 1;
        if (i != 0) {
            asyo.d = i4;
            asyo.a = i3 | 4;
            asyo asyo2 = (asyo) o.i();
            atfh atfh = atfh.RPC_GET_SETTINGS_FAILURE;
            aucd o2 = asyx.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asyx asyx = (asyx) o2.b;
            asyo2.getClass();
            asyx.c = asyo2;
            asyx.b = 93;
            a(atfh, o2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(long j) {
        aucd o = asyn.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyn asyn = (asyn) o.b;
        int i = asyn.a | 2;
        asyn.a = i;
        asyn.e = j;
        asyn.d = 1;
        asyn.a = 1 | i;
        asyn asyn2 = (asyn) o.i();
        atfh atfh = atfh.RPC_GET_SETTINGS_REQUEST;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyn2.getClass();
        asyx.c = asyn2;
        asyx.b = 92;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(boolean z) {
        int i;
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 6;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        asyo.c = i - 1;
        asyo.a = i2 | 2;
        asyo asyo2 = (asyo) o.i();
        atfh atfh = !z ? atfh.RPC_DELETE_LOCATIONS_FAILURE : atfh.RPC_DELETE_LOCATIONS_SUCCESS;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyo2.getClass();
        asyx.c = asyo2;
        asyx.b = 93;
        a(atfh, o2);
    }

    public final synchronized void a() {
        asvm asvm = asvm.a;
        atfh atfh = atfh.ACTIVITY_RECOGNITION_ACTIVITY_RECEIVED;
        aucd o = asyx.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyx asyx = (asyx) o.b;
        asvm.getClass();
        asyx.c = asvm;
        asyx.b = 90;
        a(atfh, o);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 6;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        asyo.c = 2;
        int i3 = i2 | 2;
        asyo.a = i3;
        int i4 = i - 1;
        if (i != 0) {
            asyo.d = i4;
            asyo.a = i3 | 4;
            asyo asyo2 = (asyo) o.i();
            atfh atfh = atfh.RPC_DELETE_LOCATIONS_FAILURE;
            aucd o2 = asyx.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asyx asyx = (asyx) o2.b;
            asyo2.getClass();
            asyx.c = asyo2;
            asyx.b = 93;
            a(atfh, o2);
        } else {
            throw null;
        }
    }

    public final synchronized void a(int i, Boolean bool) {
        aucd o = aszj.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszj aszj = (aszj) o.b;
        aszj.a |= 1;
        aszj.b = i;
        int a2 = ajjd.a(bool);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszj aszj2 = (aszj) o.b;
        aszj2.c = a2 - 1;
        aszj2.a |= 2;
        aszj aszj3 = (aszj) o.i();
        atfh atfh = atfh.WIFI_SCAN;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        aszj3.getClass();
        asyx.c = aszj3;
        asyx.b = 87;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j) {
        aucd o = asyn.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyn asyn = (asyn) o.b;
        int i = asyn.a | 2;
        asyn.a = i;
        asyn.e = j;
        asyn.d = 6;
        asyn.a = i | 1;
        asyn asyn2 = (asyn) o.i();
        atfh atfh = atfh.RPC_DELETE_LOCATIONS_REQUEST;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyn2.getClass();
        asyx.c = asyn2;
        asyx.b = 92;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j, long j2, long j3, long j4) {
        aucd o = asym.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asym asym = (asym) o.b;
        int i = asym.a | 1;
        asym.a = i;
        asym.b = j2;
        int i2 = i | 2;
        asym.a = i2;
        asym.c = j3;
        asym.a = i2 | 4;
        asym.d = j4;
        asym asym2 = (asym) o.i();
        aucd o2 = asyn.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyn asyn = (asyn) o2.b;
        int i3 = asyn.a | 2;
        asyn.a = i3;
        asyn.e = j;
        asyn.d = 5;
        asyn.a = i3 | 1;
        asym2.getClass();
        asyn.c = asym2;
        asyn.b = 3;
        asyn asyn2 = (asyn) o2.i();
        atfh atfh = atfh.RPC_REPORT_LOCATIONS_REQUEST;
        aucd o3 = asyx.e.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        asyx asyx = (asyx) o3.b;
        asyn2.getClass();
        asyx.c = asyn2;
        asyx.b = 92;
        a(atfh, o3);
    }

    public final synchronized void a(aswk aswk, atfh atfh, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) list.get(i);
            aucd o = asyx.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyx asyx = (asyx) o.b;
            aswk.getClass();
            asyx.c = aswk;
            asyx.b = 105;
            a(atfh, (asyx) o.i(), account.name);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(atev atev, aucd aucd) {
        if (aztb.k()) {
            aucd o = asyx.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asyx asyx = (asyx) o.b;
            asvn asvn = (asvn) aucd.i();
            asvn.getClass();
            asyx.c = asvn;
            asyx.b = 104;
            a((atfh) b.getOrDefault(atev, atfh.UNKNOWN_EVENT), o);
        }
    }

    public final synchronized void a(atev atev, String str, String str2, int i) {
        if (aztb.k()) {
            a(atev, b(atev, str, str2, i));
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(atev atev, String str, String str2, UploadRequest uploadRequest, UploadRequestResult uploadRequestResult) {
        if (aztb.k()) {
            aucd o = asvo.d.o();
            aucd b2 = b(atev, str, str2, uploadRequestResult.a);
            if (uploadRequestResult.a != 4) {
                String str3 = uploadRequest.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asvo asvo = (asvo) o.b;
                str3.getClass();
                int i = asvo.a | 1;
                asvo.a = i;
                asvo.b = str3;
                String str4 = uploadRequest.f;
                str4.getClass();
                asvo.a = i | 2;
                asvo.c = str4;
            }
            if (b2.c) {
                b2.c();
                b2.c = false;
            }
            asvn asvn = (asvn) b2.b;
            asvo asvo2 = (asvo) o.i();
            asvn asvn2 = asvn.k;
            asvo2.getClass();
            asvn.c = asvo2;
            asvn.b = 8;
            a(atev, b2);
        }
    }

    public final synchronized void a(Boolean bool) {
        aucd o = asyg.c.o();
        int a2 = ajjd.a(bool);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyg asyg = (asyg) o.b;
        asyg.b = a2 - 1;
        asyg.a |= 4;
        asyg asyg2 = (asyg) o.i();
        atfh atfh = atfh.LOCATION_UPDATE;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyg2.getClass();
        asyx.c = asyg2;
        asyx.b = 95;
        a(atfh, o2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ajml ajml = (ajml) it.next();
                    b(Boolean.valueOf(ajml.h)).add(ajml);
                }
                for (Map.Entry entry : this.f.entrySet()) {
                    a((List) entry.getValue(), (Boolean) entry.getKey());
                }
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List r11, java.lang.Boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            asvy r0 = defpackage.asvy.g     // Catch:{ all -> 0x00b2 }
            aucd r0 = r0.o()     // Catch:{ all -> 0x00b2 }
            if (r11 == 0) goto L_0x00b0
            boolean r1 = r11.isEmpty()     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x00b0
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x00b2 }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0018:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x00b2 }
            r8 = 2
            r9 = 1
            if (r7 == 0) goto L_0x003b
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x00b2 }
            ajml r7 = (defpackage.ajml) r7     // Catch:{ all -> 0x00b2 }
            int r7 = r7.e     // Catch:{ all -> 0x00b2 }
            if (r7 == r9) goto L_0x0038
            if (r7 == r8) goto L_0x0035
            r8 = 3
            if (r7 == r8) goto L_0x0032
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0032:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0035:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x0038:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x003b:
            int r12 = defpackage.ajjd.a((java.lang.Boolean) r12)     // Catch:{ all -> 0x00b2 }
            boolean r1 = r0.c     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            r0.c()     // Catch:{ all -> 0x00b2 }
            r0.c = r2     // Catch:{ all -> 0x00b2 }
        L_0x0049:
            aucj r1 = r0.b     // Catch:{ all -> 0x00b2 }
            asvy r1 = (defpackage.asvy) r1     // Catch:{ all -> 0x00b2 }
            int r12 = r12 + -1
            r1.b = r12     // Catch:{ all -> 0x00b2 }
            int r12 = r1.a     // Catch:{ all -> 0x00b2 }
            r12 = r12 | r8
            r1.a = r12     // Catch:{ all -> 0x00b2 }
            r12 = r12 | 256(0x100, float:3.59E-43)
            r1.a = r12     // Catch:{ all -> 0x00b2 }
            r1.f = r3     // Catch:{ all -> 0x00b2 }
            r12 = r12 | 16
            r1.a = r12     // Catch:{ all -> 0x00b2 }
            r1.d = r5     // Catch:{ all -> 0x00b2 }
            r12 = r12 | 128(0x80, float:1.794E-43)
            r1.a = r12     // Catch:{ all -> 0x00b2 }
            r1.e = r6     // Catch:{ all -> 0x00b2 }
            r12 = r12 | 4
            r1.a = r12     // Catch:{ all -> 0x00b2 }
            r1.c = r4     // Catch:{ all -> 0x00b2 }
            int r11 = r11.size()     // Catch:{ all -> 0x00b2 }
            if (r11 == r9) goto L_0x0077
            atfh r11 = defpackage.atfh.BLE_SCAN_BATCH     // Catch:{ all -> 0x00b2 }
            goto L_0x0088
        L_0x0077:
            if (r3 <= 0) goto L_0x007c
            atfh r11 = defpackage.atfh.BLE_SCAN_IBEACON     // Catch:{ all -> 0x00b2 }
            goto L_0x0088
        L_0x007c:
            if (r5 <= 0) goto L_0x0081
            atfh r11 = defpackage.atfh.BLE_SCAN_UID     // Catch:{ all -> 0x00b2 }
            goto L_0x0088
        L_0x0081:
            if (r6 > 0) goto L_0x0086
            atfh r11 = defpackage.atfh.BLE_SCAN_UNKNOWN     // Catch:{ all -> 0x00b2 }
            goto L_0x0088
        L_0x0086:
            atfh r11 = defpackage.atfh.BLE_SCAN_EIDR     // Catch:{ all -> 0x00b2 }
        L_0x0088:
            asyx r12 = defpackage.asyx.e     // Catch:{ all -> 0x00b2 }
            aucd r12 = r12.o()     // Catch:{ all -> 0x00b2 }
            boolean r1 = r12.c     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            r12.c()     // Catch:{ all -> 0x00b2 }
            r12.c = r2     // Catch:{ all -> 0x00b2 }
        L_0x0098:
            aucj r1 = r12.b     // Catch:{ all -> 0x00b2 }
            asyx r1 = (defpackage.asyx) r1     // Catch:{ all -> 0x00b2 }
            aucj r0 = r0.i()     // Catch:{ all -> 0x00b2 }
            asvy r0 = (defpackage.asvy) r0     // Catch:{ all -> 0x00b2 }
            r0.getClass()     // Catch:{ all -> 0x00b2 }
            r1.c = r0     // Catch:{ all -> 0x00b2 }
            r0 = 98
            r1.b = r0     // Catch:{ all -> 0x00b2 }
            r10.a((defpackage.atfh) r11, (defpackage.aucd) r12)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r10)
            return
        L_0x00b0:
            monitor-exit(r10)
            return
        L_0x00b2:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x00b6
        L_0x00b5:
            throw r11
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjc.a(java.util.List, java.lang.Boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        int i;
        aucd o = asyo.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asyo asyo = (asyo) o.b;
        asyo.b = 5;
        int i2 = asyo.a | 1;
        asyo.a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        asyo.c = i - 1;
        asyo.a = i2 | 2;
        asyo asyo2 = (asyo) o.i();
        atfh atfh = !z ? atfh.RPC_REPORT_LOCATIONS_FAILURE : atfh.RPC_REPORT_LOCATIONS_SUCCESS;
        aucd o2 = asyx.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asyx asyx = (asyx) o2.b;
        asyo2.getClass();
        asyx.c = asyo2;
        asyx.b = 93;
        a(atfh, o2);
    }
}
