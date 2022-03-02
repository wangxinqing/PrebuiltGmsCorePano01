package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.chimera.Activity;
import com.google.android.gms.mdm.BaseLockscreenChimeraActivity$1;

/* renamed from: smf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class smf extends Activity implements View.OnClickListener {
    protected static final IntentFilter a = new IntentFilter("com.google.android.gms.mdm.DISMISS_MESSAGE");
    public ImageButton b;
    protected String c;
    protected alv d;
    protected final BroadcastReceiver e = new BaseLockscreenChimeraActivity$1(this, "security");

    public static Intent a(Context context, String str, String str2, boolean z) {
        Intent a2 = aann.a(context, "com.google.android.gms.mdm.LockscreenActivity");
        a2.putExtra("lock_message", str);
        if (!TextUtils.isEmpty(str2)) {
            a2.putExtra("phone_number", str2);
        }
        a2.setFlags(1350565888);
        if (z) {
            a2.addFlags(536870912);
        } else {
            a2.addFlags(67108864);
        }
        return a2;
    }
}
