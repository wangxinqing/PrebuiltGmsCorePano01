package defpackage;

import android.content.Context;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;

/* renamed from: ajjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjd {
    public static ajjc a;
    private static final int[] b = {13, 6, 20, 11, 8, 12, 5, 15, 16, 9, 4, 14, 19, 10, 18, 7, 17};

    private static int a(int i) {
        if (i == 0) {
            ajix.c("GCoreUlr", "Received RPC response error but status code is OK.");
        }
        if (i < 0 || i > 16) {
            return 1;
        }
        return b[i];
    }

    public static void b(long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("UlrClearcutEvents.logGetSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.b(j);
        }
    }

    public static void c(long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("UlrClearcutEvents.logSetSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.c(j);
        }
    }

    public static void d(long j) {
        StringBuilder sb = new StringBuilder(68);
        sb.append("UlrClearcutEvents.logGetUserSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.d(j);
        }
    }

    public static void e(long j) {
        StringBuilder sb = new StringBuilder(76);
        sb.append("UlrClearcutEvents.logSetRemoteDeviceSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.e(j);
        }
    }

    public static void f(Throwable th) {
        if (c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("UlrClearcutEvents.logSetSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            a.f(g(th));
        }
    }

    private static int g(Throwable th) {
        NetworkResponse networkResponse;
        String str;
        if (th instanceof eif) {
            return 21;
        }
        if (azsy.a.a().e() && (th instanceof babk)) {
            return a(((babk) th).a.r.r);
        }
        if (th instanceof NoConnectionError) {
            return 2;
        }
        if (th instanceof NetworkError) {
            return 3;
        }
        if (!(!(th instanceof VolleyError) || (networkResponse = ((VolleyError) th).networkResponse) == null || (str = (String) networkResponse.headers.get("RPC-Canonical-Code")) == null)) {
            try {
                return a(Integer.parseInt(str));
            } catch (NumberFormatException e) {
            }
        }
        return 1;
    }

    static int a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? 2 : 3;
        }
        return 1;
    }

    public static void b(Boolean bool, List list) {
        String valueOf = String.valueOf(bool);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("UlrClearcutEvents.logAirplaneModeChange(");
        sb.append(valueOf);
        sb.append(")");
        sb.toString();
        if (d()) {
            aucd o = aswk.l.o();
            boolean booleanValue = bool.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aswk aswk = (aswk) o.b;
            aswk.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aswk.j = booleanValue;
            a.a((aswk) o.i(), !bool.booleanValue() ? atfh.AIRPLANE_MODE_OFF : atfh.AIRPLANE_MODE_ON, list);
        }
    }

    public static void c(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallTryOptInRequest('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (a() && b()) {
            a.a(atev.AC_TRY_OPT_IN_REQUEST, str, str2, i);
        }
    }

    public static void d(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallCancelUploadRequest('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (a() && b()) {
            a.a(atev.AC_CANCEL_UPLOAD, str, str2, i);
        }
    }

    public static void e(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallSendData('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (a() && b()) {
            a.a(atev.AC_SEND_DATA, str, str2, i);
        }
    }

    public static void f(boolean z) {
        StringBuilder sb = new StringBuilder(62);
        sb.append("UlrClearcutEvents.logSetRemoteDeviceSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.f(z);
        }
    }

    public static void a(long j) {
        StringBuilder sb = new StringBuilder(68);
        sb.append("UlrClearcutEvents.logDeleteLocationsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.a(j);
        }
    }

    public static void a(long j, long j2, long j3, long j4) {
        StringBuilder sb = new StringBuilder(134);
        sb.append("UlrClearcutEvents.logReportLocationsRPCRequest(");
        long j5 = j;
        sb.append(j);
        sb.append(", ");
        long j6 = j2;
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.a(j, j2, j3, j4);
        }
    }

    public static void c(Throwable th) {
        if (c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("UlrClearcutEvents.logGetUserSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            a.c(g(th));
        }
    }

    public static void d(Throwable th) {
        if (c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("UlrClearcutEvents.logReportLocationsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            a.d(g(th));
        }
    }

    public static void e(Throwable th) {
        if (c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
            sb.append("UlrClearcutEvents.logSetRemoteDeviceSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            a.e(g(th));
        }
    }

    public static void c(boolean z) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("UlrClearcutEvents.logGetSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.c(z);
        }
    }

    public static void d(boolean z) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("UlrClearcutEvents.logSetSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.d(z);
        }
    }

    public static synchronized void a(Context context) {
        synchronized (ajjd.class) {
            if (a == null) {
                a = new ajjc(context);
            }
        }
    }

    public static void e(boolean z) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("UlrClearcutEvents.logGetUserSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.e(z);
        }
    }

    public static void b(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallTryOptIn('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (a() && b()) {
            a.a(atev.AC_TRY_OPT_IN, str, str2, i);
        }
    }

    public static boolean c() {
        return a != null && azte.d();
    }

    public static boolean d() {
        return a != null && azsj.b();
    }

    public static void a(Boolean bool, List list) {
        String valueOf = String.valueOf(bool);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("UlrClearcutEvents.logWifiEnabledChange(");
        sb.append(valueOf);
        sb.append(")");
        sb.toString();
        if (d()) {
            aucd o = aswk.l.o();
            boolean booleanValue = bool.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aswk aswk = (aswk) o.b;
            aswk.a |= 64;
            aswk.h = booleanValue;
            a.a((aswk) o.i(), !bool.booleanValue() ? atfh.WIFI_DISABLED : atfh.WIFI_ENABLED, list);
        }
    }

    public static void b(Throwable th) {
        if (!c()) {
            return;
        }
        if (th != null) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("UlrClearcutEvents.logGetSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            a.b(g(th));
            return;
        }
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("UlrClearcutEvents.logGetSettingsRPCResponse(false, null)");
        sb2.toString();
        a.b(1);
    }

    public static void b(boolean z) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("UlrClearcutEvents.logDeleteLocationsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.b(z);
        }
    }

    public static void a(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallGetReportingState('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.append(")");
        sb.toString();
        if (a() && b()) {
            a.a(atev.AC_GET_REPORTING_STATE_SAFE, str, str2, i);
        }
    }

    public static boolean b() {
        return a != null && aztb.k();
    }

    public static void a(String str, String str2, UploadRequest uploadRequest, UploadRequestResult uploadRequestResult) {
        String valueOf = String.valueOf(uploadRequest);
        String valueOf2 = String.valueOf(uploadRequestResult);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 55 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("UlrClearcutEvents.logApiCallRequestUpload('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", <");
        sb.append(valueOf);
        sb.append(">, <");
        sb.append(valueOf2);
        sb.append(">");
        sb.toString();
        if (a() && b()) {
            a.a(atev.AC_REQUEST_UPLOAD, str, str2, uploadRequest, uploadRequestResult);
        }
    }

    public static void a(Throwable th) {
        if (c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("UlrClearcutEvents.logDeleteLocationsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            a.a(g(th));
        }
    }

    public static void a(List list) {
        String str;
        if (list != null) {
            str = String.valueOf(Integer.toString(list.size())).concat(" sightings");
        } else {
            str = "null";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("UlrClearcutEvents.logBleSightings(");
        sb.append(str);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.a(list);
        }
    }

    public static void a(boolean z) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("UlrClearcutEvents.logReportLocationsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (a()) {
            a.a(z);
        }
    }

    public static boolean a() {
        return a != null && aztb.a.a().ah();
    }
}
