package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mdm.services.SitrepHelperIntentOperation;

/* renamed from: smk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class smk extends DialogFragment implements DialogInterface.OnClickListener {
    private boolean a = false;

    /* access modifiers changed from: protected */
    public abstract void a(Activity activity);

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a = true;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity = getActivity();
        if (activity == null) {
            snn.c("Null activity when trying to perform device admin requests.", new Object[0]);
        } else if (!this.a) {
            Intent startIntent = IntentOperation.getStartIntent((Context) activity, SitrepHelperIntentOperation.class, "com.google.android.gms.mdm.services.ACTION_DIALOG_DISMISSED");
            startIntent.putExtra("force", false);
            startIntent.putExtra("reason", 5);
            activity.startService(startIntent);
        } else {
            a(activity);
        }
        super.onDismiss(dialogInterface);
    }
}
