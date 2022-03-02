package com.google.android.gms.smartdevice.d2d.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetDirectTransferChimeraActivity extends bjs implements ackg, aced {
    private ResultReceiver a;
    private ProxyResultReceiver b;
    private accm c = new accm(this, new acdc());

    public final void a(int i, Bundle bundle) {
        if (i == 2051) {
            acpg.a(this);
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown event code: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    public final void onBackPressed() {
        this.a.send(2004, Bundle.EMPTY);
        acpg.a(this);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aceg.a((Activity) this);
        setContentView((int) R.layout.smartdevice_fragment_container);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("resultReceiver");
        if (resultReceiver != null) {
            this.a = resultReceiver;
            if (bundle == null) {
                ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("extraAccountChallengeData");
                if (parcelableArrayListExtra == null) {
                    finish();
                    return;
                }
                this.c.a(1, 1, ackh.b(parcelableArrayListExtra, ""));
                return;
            }
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.a.send(2002, Bundle.EMPTY);
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.b = new ProxyResultReceiver((Handler) null, this);
        Bundle bundle = new Bundle();
        bundle.putParcelable("resultReceiver", this.b);
        this.a.send(2001, bundle);
    }

    public final void a(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accountChallengeData", arrayList);
        this.a.send(2003, bundle);
        acpg.a(this);
    }
}
