package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;

/* renamed from: ijd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ijd extends FragmentActivity {
    private boolean a;
    private ijn b;

    /* access modifiers changed from: protected */
    public final String i() {
        return this.b.a;
    }

    public final void onAttachedToWindow() {
        if (this.b.c) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.b.d;
            attributes.height = this.b.e;
            if (this.b.b) {
                window.addFlags(524288);
            }
            window.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.b = ijn.a(getIntent().getBundleExtra("ui_parameters"));
        this.a = intent.getBooleanExtra("use_immersive_mode", false);
        if (awku.c()) {
            ijm.a((Activity) this, this.a, (Context) this);
        }
        String str = this.b.a;
        boolean z = this.a;
        if (awku.c()) {
            ijm.a(this, str);
        } else {
            ijm.a((Activity) this, str, z);
        }
    }
}
