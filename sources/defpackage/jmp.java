package defpackage;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SwitchBar;

/* renamed from: jmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jmp extends bjs implements jmo {
    private SwitchBar a;

    public final void a(boolean z) {
        e(z);
    }

    public final void b(boolean z) {
        this.a.setVisibility(!z ? 8 : 0);
    }

    public final void c(boolean z) {
        this.a.a(z);
    }

    public final void d(boolean z) {
        this.a.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public abstract void e(boolean z);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sg aE = aE();
        if (aE != null) {
            aE.b(true);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        SwitchBar switchBar = (SwitchBar) findViewById(R.id.switch_bar);
        this.a = switchBar;
        if (switchBar != null) {
            switchBar.setVisibility(0);
            this.a.a = this;
            PackageManager packageManager = getPackageManager();
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(getComponentName(), 0);
                SwitchBar switchBar2 = this.a;
                CharSequence loadLabel = activityInfo.loadLabel(packageManager);
                switchBar2.b = loadLabel;
                switchBar2.setContentDescription(loadLabel);
            } catch (PackageManager.NameNotFoundException e) {
                apev.a(e);
            }
        } else {
            throw new IllegalStateException("SwitchBar missing from layout");
        }
    }
}
