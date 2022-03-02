package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import java.util.regex.Matcher;

/* renamed from: opn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opn extends bhw implements opo {
    private final Context a;
    private final nwb b;

    public opn() {
        super("com.google.android.gms.http.IGoogleHttpService");
    }

    private final void a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid() && !hya.a(this.a).a(callingUid)) {
            throw new SecurityException("Uid is not Google Signed");
        }
    }

    public final Bundle a(String str) {
        nwc nwc;
        String str2;
        String a2;
        a();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            nwe a3 = nwe.a(this.a);
            Matcher matcher = a3.c.matcher(str);
            int i = 0;
            if (matcher.lookingAt()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= a3.b.length) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (matcher.group(i3) != null) {
                        nwc = a3.b[i2];
                        break;
                    }
                    i2 = i3;
                }
            }
            nwc = nwc.d;
            Bundle bundle = null;
            if (!nwc.c) {
                String str3 = nwc.b;
                if (str3 != null) {
                    String valueOf = String.valueOf(str.substring(nwc.a.length()));
                    str2 = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
                } else {
                    str2 = str;
                }
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str2, str)) {
                bundle = new Bundle();
                if (str2 == null) {
                    bundle.putString("block", "1");
                } else {
                    bundle.putString("rewrite", str2);
                }
            }
            if (bundle == null || !bundle.containsKey("block")) {
                if (bundle != null) {
                    if (bundle.containsKey("rewrite")) {
                        str = bundle.getString("rewrite");
                    }
                }
                nwb nwb = this.b;
                if (nwb.b() && (a2 = nwb.a(str)) != null) {
                    synchronized (nwb.b) {
                        nwa nwa = (nwa) nwb.b.get(a2);
                        if (nwa != null && nwa.c > SystemClock.elapsedRealtime()) {
                            int i4 = nwa.d;
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("Last HTTP status code for blocked entry: ");
                            sb.append(i4);
                            Log.i("GCM.HTTP", sb.toString());
                            i = 2;
                        }
                    }
                }
                if (i == 2) {
                    StringBuilder sb2 = new StringBuilder(28);
                    sb2.append("temporary_blocked");
                    sb2.append(i);
                    String sb3 = sb2.toString();
                    bundle = new Bundle();
                    bundle.putString("name", sb3);
                    bundle.putString("block", "1");
                    String valueOf2 = String.valueOf(str);
                    Log.w("GCM.HTTP", valueOf2.length() == 0 ? new String("HTTP request blocked due to automatic backoff: ") : "HTTP request blocked due to automatic backoff: ".concat(valueOf2));
                }
            } else {
                String valueOf3 = String.valueOf(str);
                Log.w("GCM.HTTP", valueOf3.length() == 0 ? new String("HTTP request blocked due to server rule: ") : "HTTP request blocked due to server rule: ".concat(valueOf3));
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return bundle;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public opn(Context context) {
        super("com.google.android.gms.http.IGoogleHttpService");
        this.a = context.getApplicationContext();
        this.b = nwb.a();
    }

    public final void a(String str, int i) {
        String a2;
        a();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            nwb nwb = this.b;
            if (nwb.b() && (a2 = nwb.a(str)) != null) {
                synchronized (nwb.b) {
                    if (i > 0 && i < 500 && i != 429) {
                        nwb.b.remove(a2);
                    } else {
                        nwa nwa = (nwa) nwb.b.get(a2);
                        if (nwa == null) {
                            if (((ou) nwb.b).h >= 100) {
                                String valueOf = String.valueOf(str);
                                Log.w("GCM.HTTP", valueOf.length() == 0 ? new String("Backoff lookup map has grown too big. Not considering for backoff newly failing url: ") : "Backoff lookup map has grown too big. Not considering for backoff newly failing url: ".concat(valueOf));
                            } else {
                                nwa = new nwa(nwb);
                                nwb.b.put(a2, nwa);
                            }
                        }
                        int i2 = nwa.a + 1;
                        nwa.a = i2;
                        if (i2 > 3) {
                            nwa.b = ((long) (nwa.e.a.nextInt(9000) + ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS)) + Math.min(((long) nwa.a) * 1000, 86400000);
                            nwa.c = SystemClock.elapsedRealtime() + nwa.b;
                        }
                        nwa.d = i;
                    }
                }
            }
            if (i > 0) {
                Context context = this.a;
                if (qxt.a()) {
                    qxt.a(context, nxn.GOOGLE_HTTP_CLIENT);
                } else {
                    aaaz.b(context);
                }
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle a2 = a(parcel.readString());
            parcel2.writeNoException();
            bhx.b(parcel2, a2);
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
