package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.R;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;

/* renamed from: mri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mri implements View.OnClickListener {
    private final mrk a;
    private final DiscoveryListItem b;

    public mri(mrk mrk, DiscoveryListItem discoveryListItem) {
        this.a = mrk;
        this.b = discoveryListItem;
    }

    public void onClick(View view) {
        mrk mrk = this.a;
        DiscoveryListItem discoveryListItem = this.b;
        if (discoveryListItem.k) {
            Context context = mrk.a;
            anax a2 = anax.a((Object) discoveryListItem.a);
            Intent action = arza.b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LIST_ITEM_ENABLE");
            ArrayList arrayList = new ArrayList(1);
            arrayList.addAll(a2);
            context.startService(action.putStringArrayListExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_IDS", arrayList));
        }
        if (!new arxg(mrk.a).e()) {
            new AlertDialog.Builder(mrk.a).setMessage(R.string.devices_notifications_turn_on_description).setPositiveButton(17039370, (DialogInterface.OnClickListener) null).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).show();
        } else {
            mrk.a.startService(discoveryListItem.i);
        }
    }
}
