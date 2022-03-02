package defpackage;

import android.content.Context;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: dwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwy extends jba {
    private final ClientContext a;
    private final dwj d;
    private final dwd e;
    private final String f;
    private final dwm g;

    public dwy(ClientContext clientContext, dwj dwj, dwd dwd, String str, dwm dwm) {
        super(77, "AppInviteConvertInvitation");
        this.a = clientContext;
        this.d = dwj;
        this.e = dwd;
        this.f = str;
        this.g = dwm;
    }

    public final void a(Context context) {
        Status status;
        dwh dwh;
        try {
            dwj dwj = this.d;
            ClientContext clientContext = this.a;
            String str = this.f;
            dwi dwi = dwj.a;
            String str2 = clientContext.e;
            aucd o = avfh.e.o();
            aucd o2 = avge.d.o();
            String a2 = jlh.a(str);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avge avge = (avge) o2.b;
            a2.getClass();
            avge.a |= 1;
            avge.b = a2;
            avge avge2 = (avge) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfh avfh = (avfh) o.b;
            avge2.getClass();
            avfh.c = avge2;
            avfh.a |= 2;
            avfe a3 = dwi.a(str2);
            avfi avfi = null;
            if (a3 == null) {
                Log.e("AppInviteAgent", "Error creating ClientIdInfo");
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avfh avfh2 = (avfh) o.b;
                a3.getClass();
                avfh2.b = a3;
                avfh2.a |= 1;
                avgt a4 = dwi.a();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avfh avfh3 = (avfh) o.b;
                a4.getClass();
                avfh3.d = a4;
                avfh3.a |= 4;
                dwh = new dwh(dwi.a, clientContext, avfh.f, (avfh) o.i());
                dwh.b();
                avfi avfi2 = (avfi) dwh.a(avfi.c);
                if (dwh.c()) {
                    int e2 = dwh.e();
                    StringBuilder sb = new StringBuilder(56);
                    sb.append("Convert invitation failed due to error code: ");
                    sb.append(e2);
                    Log.e("AppInviteAgent", sb.toString());
                } else {
                    avfi = avfi2;
                }
            }
            if (avfi != null) {
                dlc a5 = this.e.a();
                avga avga = avfi.a;
                if (avga == null) {
                    avga = avga.c;
                }
                dwd.a(a5, avga);
                status = Status.a;
            } else {
                status = Status.c;
            }
        } catch (eif e3) {
            Log.e("AppInviteAgent", "Authentication Failed ", e3);
            throw e3;
        } catch (VolleyError e4) {
            String valueOf = String.valueOf(e4);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append("Error communicating with server ");
            sb2.append(valueOf);
            Log.e("AppInviteAgent", sb2.toString());
            throw e4;
        } catch (AuthFailureError | eif e5) {
            status = new Status(4);
        } catch (NetworkError e6) {
            status = new Status(7);
        } catch (VolleyError e7) {
            status = new Status(8);
        } catch (Throwable th) {
            avfi avfi3 = (avfi) dwh.a(avfi.c);
            throw th;
        }
        dwm dwm = this.g;
        if (dwm != null) {
            dwm.a(status);
        }
    }
}
