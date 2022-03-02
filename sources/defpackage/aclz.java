package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import java.util.Arrays;

/* renamed from: aclz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aclz {
    private static final iwd d = acqa.a("DiscoveryChimeraActivity");
    public final ConnectionRequest a;
    public final int b;
    public final abov c;

    private aclz(int i, ConnectionRequest connectionRequest, abov abov) {
        this.a = connectionRequest;
        this.b = i;
        this.c = abov;
    }

    public static byte[] b(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_for_fastpair_code");
        if (byteArrayExtra != null && byteArrayExtra.length > 0) {
            return byteArrayExtra;
        }
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES");
        if (byteArrayExtra2 != null) {
            return uzx.a(byteArrayExtra2).a(224);
        }
        return null;
    }

    public final boolean a() {
        return this.a != null;
    }

    public static aclz a(Intent intent) {
        int i;
        Uri data;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            i = !stringExtra.startsWith("android-app://com.google.android.googlequicksearchbox") ? !stringExtra.startsWith("gcore-settings") ? !stringExtra.startsWith("fastpair") ? azjt.c() ? !stringExtra.startsWith("agsa") ? 0 : 6 : 0 : 5 : 3 : 2;
        } else if (!intent2.hasExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES")) {
            Uri data2 = intent.getData();
            if (!azjt.c()) {
                i = 0;
            } else {
                if (data2 != null) {
                    String host = data2.getHost();
                    if (TextUtils.equals(host, "qr")) {
                        i = 8;
                    } else if (TextUtils.equals(host, "pair")) {
                        i = 7;
                    }
                }
                i = 0;
            }
        } else {
            i = 5;
        }
        d.b("TriggerType = %d", Integer.valueOf(i));
        ConnectionRequest connectionRequest = null;
        if (azjt.c()) {
            if (i == 5) {
                int i2 = Build.VERSION.SDK_INT;
                byte[] b2 = b(intent);
                if (b2 != null && b2.length > 0) {
                    d.b("Fastpair code: (%s)", Arrays.toString(b2));
                    connectionRequest = new ConnectionRequest((D2DDevice) null, (String) null, (String) null, b2, (String) null, 5);
                }
            } else if (i == 6) {
                Uri uri = (Uri) intent2.getParcelableExtra("deeplink");
                if (uri != null) {
                    d.b("Uri: (%s)", uri);
                    String lastPathSegment = uri.getLastPathSegment();
                    String queryParameter = uri.getQueryParameter("key");
                    if (!TextUtils.isEmpty(lastPathSegment)) {
                        connectionRequest = new ConnectionRequest((D2DDevice) null, (String) null, lastPathSegment, (byte[]) null, queryParameter, i);
                    }
                }
            } else if ((i == 7 || i == 8) && (data = intent.getData()) != null) {
                d.b("Uri: (%s)", data);
                String lastPathSegment2 = data.getLastPathSegment();
                String stringExtra2 = intent2.getStringExtra("key");
                if (!TextUtils.isEmpty(lastPathSegment2)) {
                    connectionRequest = new ConnectionRequest((D2DDevice) null, (String) null, lastPathSegment2, (byte[]) null, stringExtra2, i);
                }
            }
        }
        return new aclz(i, connectionRequest, intent2.hasExtra("device_type") ? abov.a(intent2.getStringExtra("device_type")) : abov.UNKNOWN);
    }
}
