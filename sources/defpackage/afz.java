package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: afz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class afz extends ka implements aj, bt, anp, agf {
    private final al a = new al(this);
    private final ano b = ano.a((anp) this);
    private bs c;
    public final age j = new age(new afv(this));

    public afz() {
        if (this.a != null) {
            int i = Build.VERSION.SDK_INT;
            this.a.a(new afw(this));
            this.a.a(new afx(this));
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT <= 23) {
                this.a.a(new aga(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bu.a(getWindow().getDecorView(), this);
        super.addContentView(view, layoutParams);
    }

    public final ae getLifecycle() {
        return this.a;
    }

    public final ann getSavedStateRegistry() {
        return this.b.a;
    }

    public final bs getViewModelStore() {
        if (getApplication() != null) {
            if (this.c == null) {
                afy afy = (afy) getLastNonConfigurationInstance();
                if (afy != null) {
                    this.c = afy.b;
                }
                if (this.c == null) {
                    this.c = new bs();
                }
            }
            return this.c;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object h() {
        return null;
    }

    public void onBackPressed() {
        this.j.a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.a(bundle);
        bf.a((Activity) this);
    }

    public final Object onRetainNonConfigurationInstance() {
        afy afy;
        Object h = h();
        bs bsVar = this.c;
        if (bsVar == null && (afy = (afy) getLastNonConfigurationInstance()) != null) {
            bsVar = afy.b;
        }
        if (bsVar == null && h == null) {
            return null;
        }
        afy afy2 = new afy();
        afy2.a = h;
        afy2.b = bsVar;
        return afy2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        al alVar = this.a;
        if (alVar instanceof al) {
            alVar.a(ad.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.b.b(bundle);
    }

    public void setContentView(int i) {
        bu.a(getWindow().getDecorView(), this);
        super.setContentView(i);
    }

    public void setContentView(View view) {
        bu.a(getWindow().getDecorView(), this);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bu.a(getWindow().getDecorView(), this);
        super.setContentView(view, layoutParams);
    }
}
