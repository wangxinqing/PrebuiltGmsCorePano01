package com.google.android.gms.chimera.container.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import com.google.android.setupdesign.GlifLayout;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleExtractionChimeraActivity extends bjs {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class ExtractionCompleteListener extends ResultReceiver {
        private final WeakReference a;

        public ExtractionCompleteListener(Handler handler, Activity activity) {
            super(handler);
            this.a = new WeakReference(activity);
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            Activity activity = (Activity) this.a.get();
            if (activity != null && !activity.getFragmentManager().isDestroyed()) {
                activity.setResult(-1);
                activity.finish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("asset_name");
        if (stringExtra == null) {
            setResult(0);
            finish();
            return;
        }
        aljk aljk = new aljk(aljl.a());
        aljk.a = 2132018089;
        aljk.b = false;
        setTheme(aljk.a().a(getIntent()));
        setContentView((int) R.layout.module_loading_activity);
        ((alhe) ((GlifLayout) findViewById(R.id.module_loading_layout)).a(alhe.class)).a().setVisibility(8);
        FileApkIntentOperation.a(true, (Context) this, stringExtra, (ResultReceiver) new ExtractionCompleteListener(new qvr(), this));
    }
}
