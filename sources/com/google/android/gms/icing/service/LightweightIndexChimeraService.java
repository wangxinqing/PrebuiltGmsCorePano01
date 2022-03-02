package com.google.android.gms.icing.service;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LightweightIndexChimeraService extends nio {
    private static pwz a;
    private static pwv b;
    private static pxs k;
    private oyq l;

    public LightweightIndexChimeraService() {
        super(19, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit nit2;
        nit nit3 = nit;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        if (a == null) {
            nit2 = nit3;
        } else if (b == null || k == null || this.l == null) {
            nit2 = nit3;
        } else {
            String str = getServiceRequest2.d;
            int i = getServiceRequest2.c;
            prh prh = r0;
            prh prh2 = new prh(this, this.f, nix.a(), str, i, k, this.l, new pxf(this), new oyt(this), oxx.a((Context) this), a, b, hya.a((Context) this), new pat(this), new apmj(this));
            nit.a(prh);
            return;
        }
        oso.a("LightweightIndexService is unavailable on this device");
        nit2.a(16, new Bundle());
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        FileInputStream fileInputStream;
        printWriter.println("LightweightIndexChimeraService");
        pxs pxs = k;
        if (pxs != null) {
            printWriter.println("  Pending usage reports:");
            File fileStreamPath = pxs.a.getFileStreamPath(pxs.b);
            try {
                fileInputStream = new FileInputStream(fileStreamPath);
                jkv jkv = new jkv(fileInputStream, fileStreamPath.length(), ovc.class, (auef) ovc.m.c(7));
                boolean isLoggable = Log.isLoggable("Icing", 2);
                while (jkv.hasNext()) {
                    ovc ovc = (ovc) jkv.next();
                    Object[] objArr = new Object[8];
                    boolean z = false;
                    objArr[0] = ovc.b;
                    ovg a2 = ovg.a(ovc.h);
                    if (a2 == null) {
                        a2 = ovg.GENERAL_USE;
                    }
                    objArr[1] = a2;
                    objArr[2] = Long.valueOf(ovc.g);
                    if ((ovc.a & 128) != 0) {
                        z = true;
                    }
                    objArr[3] = Boolean.valueOf(z);
                    objArr[4] = ovc.d;
                    objArr[5] = ovc.e;
                    objArr[6] = isLoggable ? ovc.f : "<redacted>";
                    otk a3 = otk.a(ovc.l);
                    if (a3 == null) {
                        a3 = otk.UNKNOWN;
                    }
                    objArr[7] = a3;
                    String valueOf = String.valueOf(String.format("From %s: type=%s, ts=%d, has_doc=%b Doc[package=%s corpus=%s, uri=%s, status=%s]", objArr));
                    printWriter.println(valueOf.length() == 0 ? new String("    ") : "    ".concat(valueOf));
                }
                fileInputStream.close();
            } catch (IOException e) {
                printWriter.println("    ".concat("<empty>"));
            } catch (Throwable th) {
                apev.a(th, th);
            }
            printWriter.println();
        }
        pwz pwz = a;
        if (pwz != null) {
            pwz.a(printWriter, "  ");
            return;
        }
        return;
        throw th;
    }

    public final void onCreate() {
        if (axsd.f()) {
            synchronized (LightweightIndexChimeraService.class) {
                if (k == null) {
                    k = new pxs(this, "appdatasearch_usage");
                }
            }
            if (a == null) {
                a = new pwz();
            }
            if (b == null) {
                b = new pwv();
            }
            this.l = new oyq(this);
        }
    }

    public final void onDestroy() {
        pxs pxs = k;
        if (pxs != null) {
            pxs.b();
        }
    }
}
