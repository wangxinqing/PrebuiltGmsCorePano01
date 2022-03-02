package defpackage;

import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/* renamed from: mpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpr extends mhh {
    private final String b;
    private final boolean c;
    private final String d;

    public mpr(Context context, String str, boolean z, String str2) {
        super(context);
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        InputStream inputStream;
        String readLine;
        String valueOf = String.valueOf(this.b);
        if (valueOf.length() == 0) {
            new String("Reauth account name : ");
        } else {
            "Reauth account name : ".concat(valueOf);
        }
        ith ith = mfv.a;
        aucd o = aqkk.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqkk aqkk = (aqkk) o.b;
        "me".getClass();
        aqkk.a |= 1;
        aqkk.b = "me";
        aucd o2 = aqkl.d.o();
        if (!this.c) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqkl aqkl = (aqkl) o2.b;
            aqkl.b = 1;
            aqkl.a |= 1;
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqkl aqkl2 = (aqkl) o2.b;
            aqkl2.b = 2;
            aqkl2.a |= 1;
        }
        String str = this.d;
        aqkl aqkl3 = (aqkl) o2.b;
        str.getClass();
        aqkl3.a |= 4;
        aqkl3.c = str;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqkk aqkk2 = (aqkk) o.b;
        aqkl aqkl4 = (aqkl) o2.i();
        aqkl4.getClass();
        aqkk2.c = aqkl4;
        aqkk2.a |= 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqkk aqkk3 = (aqkk) o.b;
        aqkk3.e = 0;
        aqkk3.a |= 8;
        try {
            mfw.b();
            mfn a = mfw.a();
            mfw.b();
            ClientContext a2 = mfw.a(this.b);
            aqkk aqkk4 = (aqkk) o.i();
            iyn iyn = a.a;
            StringBuilder sb = new StringBuilder();
            sb.append("/users/");
            sb.append(iyv.a(aqkk4.b));
            sb.append("/reauthProofTokens?alt=proto");
            if (!(aqkk4 == null || aqkk4.d.length() == 0)) {
                sb.append("&versionInfo=");
                sb.append(iyv.a(aqkk4.d));
            }
            if (aqkk4 != null) {
                int a3 = aqkq.a(aqkk4.e);
                if (a3 != 0) {
                    if (a3 != 1) {
                        sb.append("&delegationType=");
                        int a4 = aqkq.a(aqkk4.e);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        sb.append(a4 - 1);
                    }
                }
            }
            String sb2 = sb.toString();
            aqkl aqkl5 = aqkk4.c;
            if (aqkl5 == null) {
                aqkl5 = aqkl.d;
            }
            aqku aqku = (aqku) iyn.a(a2, 1, sb2, aqkl5.k(), (Object) aqku.a);
            return new mhn(true, 0);
        } catch (eif e) {
            return new mhn(false, 2);
        } catch (VolleyError e2) {
            NetworkResponse networkResponse = e2.networkResponse;
            if (networkResponse != null && networkResponse.statusCode == 400) {
                byte[] bArr = networkResponse.data;
                try {
                    if (jjt.a(bArr)) {
                        inputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                    } else {
                        inputStream = new ByteArrayInputStream(bArr);
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    do {
                        readLine = bufferedReader.readLine();
                        if (readLine != null) {
                        }
                    } while (!readLine.toUpperCase(Locale.ENGLISH).contains("INVALID_GRANT"));
                    return new mhn(false, 1);
                } catch (IOException e3) {
                    return new mhn(false, 2);
                }
            }
            return new mhn(false, 2);
        }
    }
}
