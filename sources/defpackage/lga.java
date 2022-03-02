package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: lga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lga implements lfn {
    private static final ith a = new ith("ImpressionExecutionResu", "");
    private final lgc b;
    private aucd c = amau.d.o();

    public lga(lgc lgc) {
        this.b = lgc;
    }

    private final void c() {
        iva.a((Object) this.c, (Object) "Builder can only be used once.");
    }

    public final void a() {
        boolean z;
        c();
        lgc lgc = this.b;
        amau amau = (amau) this.c.i();
        lgc.k();
        if ((((ambk) lgc.e.b).a & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't set executionResult more than once");
        aucd aucd = lgc.e;
        iva.a((Object) amau);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        amau.getClass();
        ambk.F = amau;
        ambk.a |= 536870912;
        this.c = null;
    }

    public final /* bridge */ /* synthetic */ void b() {
        c();
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amau amau = (amau) aucd.b;
        amau amau2 = amau.d;
        amau.a |= 2;
        amau.c = true;
    }

    public final /* bridge */ /* synthetic */ void b(int i) {
        boolean z;
        int i2;
        c();
        if (((((amau) this.c.b).a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Can't call setOperationErrorStatusCode() twice or with setSynErrorStatusCode()");
        aucd aucd = this.c;
        if (i != 10) {
            switch (i) {
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 8;
                    break;
                case 8:
                    i2 = 9;
                    break;
                default:
                    switch (i) {
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                            i2 = 13;
                            break;
                        case UrlRequest.Status.READING_RESPONSE /*14*/:
                            i2 = 14;
                            break;
                        case Service.START_CONTINUATION_MASK:
                            i2 = 15;
                            break;
                        case 16:
                            i2 = 16;
                            break;
                        case 17:
                            i2 = 17;
                            break;
                        default:
                            switch (i) {
                                case 1500:
                                    i2 = 18;
                                    break;
                                case 1501:
                                    i2 = 19;
                                    break;
                                case 1502:
                                    i2 = 20;
                                    break;
                                case 1503:
                                    i2 = 21;
                                    break;
                                case 1504:
                                    i2 = 22;
                                    break;
                                case 1505:
                                    i2 = 23;
                                    break;
                                case 1506:
                                    i2 = 24;
                                    break;
                                case 1507:
                                    i2 = 25;
                                    break;
                                case 1508:
                                    i2 = 26;
                                    break;
                                case 1509:
                                    i2 = 27;
                                    break;
                                case 1510:
                                    i2 = 34;
                                    break;
                                case 1511:
                                    i2 = 35;
                                    break;
                                default:
                                    a.b("ImpressionExecutionResu", "Unknown operation error status code: %d", Integer.valueOf(i));
                                    i2 = 1;
                                    break;
                            }
                    }
            }
        } else {
            i2 = 11;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amau amau = (amau) aucd.b;
        amau amau2 = amau.d;
        amau.b = i2 - 1;
        amau.a |= 1;
    }

    public final /* bridge */ /* synthetic */ void a(int i) {
        boolean z;
        int i2;
        c();
        if (((((amau) this.c.b).a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Can't call setSynErrorStatusCode() twice or with setOperationErrorStatusCode()");
        aucd aucd = this.c;
        if (i != 0) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amau amau = (amau) aucd.b;
        amau amau2 = amau.d;
        amau.b = i2 - 1;
        amau.a |= 1;
    }
}
