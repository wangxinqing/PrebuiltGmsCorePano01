package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;

/* renamed from: wej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wej implements acvv {
    private final wgu a;
    private final String b;

    public wej(wgu wgu, String str) {
        this.a = wgu;
        this.b = str;
    }

    public final void a(Object obj) {
        ConnectToWifiNetworkResponse connectToWifiNetworkResponse = (ConnectToWifiNetworkResponse) obj;
        this.a.a(0, (int) R.string.sharing_toast_wifi_connection_succeeded, this.b);
    }
}
