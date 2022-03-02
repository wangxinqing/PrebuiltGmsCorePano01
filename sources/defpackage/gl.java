package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: gl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gl extends afz implements fo, fp {
    final gv a;
    final al b = new al(this);
    boolean c;
    boolean d;
    boolean e = true;
    boolean f;
    boolean g;
    int h;
    ov i;

    public gl() {
        gk gkVar = new gk(this);
        ot.a((Object) gkVar, (Object) "callbacks == null");
        this.a = new gv(gkVar);
    }

    static void a(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private final void e() {
        do {
        } while (a(at(), ad.CREATED));
    }

    public void a(gj gjVar) {
    }

    public final void aq() {
        a(0);
    }

    public final hl at() {
        return this.a.a();
    }

    public final int b(gj gjVar) {
        if (this.i.c() < 65534) {
            while (this.i.e(this.h) >= 0) {
                this.h = (this.h + 1) % 65534;
            }
            int i2 = this.h;
            this.i.b(i2, gjVar.q);
            this.h = (this.h + 1) % 65534;
            return i2;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    @Deprecated
    public void c() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.c);
        printWriter.print(" mResumed=");
        printWriter.print(this.d);
        printWriter.print(" mStopped=");
        printWriter.print(this.e);
        if (getApplication() != null) {
            is.a((aj) this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.a.a().a(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.a.b();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String str = (String) this.i.a(i5);
            this.i.b(i5);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            gj a2 = this.a.a(str);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
                return;
            }
            a2.onActivityResult((char) i2, i3, intent);
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.b();
        this.a.a.e.a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        gx gxVar = this.a.a;
        gxVar.e.a(gxVar, (gt) gxVar, (gj) null);
        if (bundle != null) {
            this.a.a.e.a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.h = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || (length = intArray.length) != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.i = new ov(length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.i.b(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new ov();
            this.h = 0;
        }
        super.onCreate(bundle);
        this.b.a(ac.ON_CREATE);
        this.a.a.e.h();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
        gv gvVar = this.a;
        return onCreatePanelMenu | gvVar.a.e.a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.a.a.e.n();
        this.b.a(ac.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.a.a.e.o();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.a.a.e.a(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.a.a.e.b(menuItem);
    }

    public final void onMultiWindowModeChanged(boolean z) {
        this.a.a.e.b(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.a.b();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.a.a.e.b(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.d = false;
        this.a.a.e.l();
        this.b.a(ac.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        this.a.a.e.c(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        b();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return a(view, menu) | this.a.a.e.a(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.a.b();
        char c2 = (char) (i2 >> 16);
        if (c2 != 0) {
            int i3 = c2 - 1;
            String str = (String) this.i.a(i3);
            this.i.b(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.a.a(str) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.d = true;
        this.a.b();
        this.a.c();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e();
        this.b.a(ac.ON_STOP);
        Parcelable g2 = this.a.a.e.g();
        if (g2 != null) {
            bundle.putParcelable("android:support:fragments", g2);
        }
        if (this.i.c() > 0) {
            bundle.putInt("android:support:next_request_index", this.h);
            int[] iArr = new int[this.i.c()];
            String[] strArr = new String[this.i.c()];
            for (int i2 = 0; i2 < this.i.c(); i2++) {
                iArr[i2] = this.i.c(i2);
                strArr[i2] = (String) this.i.d(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.e = false;
        if (!this.c) {
            this.c = true;
            this.a.a.e.i();
        }
        this.a.b();
        this.a.c();
        this.b.a(ac.ON_START);
        this.a.a.e.j();
    }

    public void onStateNotSaved() {
        this.a.b();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.e = true;
        e();
        this.a.a.e.m();
        this.b.a(ac.ON_STOP);
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (!this.g && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.f && i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    private static boolean a(hl hlVar, ad adVar) {
        boolean z = false;
        for (gj gjVar : hlVar.e()) {
            if (gjVar != null) {
                if (gjVar.getHost() != null) {
                    z |= a(gjVar.getChildFragmentManager(), adVar);
                }
                if (gjVar.getLifecycle().a().a(ad.STARTED)) {
                    gjVar.ac.a(adVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a((View) null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (!this.g && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (!this.f && i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.b.a(ac.ON_RESUME);
        this.a.a.e.k();
    }

    /* access modifiers changed from: package-private */
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.a.e.c.onCreateView(view, str, context, attributeSet);
    }

    public final void a(gj gjVar, Intent intent, int i2) {
        this.g = true;
        if (i2 != -1) {
            try {
                a(i2);
                kf.a(this, intent, ((b(gjVar) + 1) << 16) + ((char) i2));
            } finally {
                this.g = false;
            }
        } else {
            kf.a(this, intent, -1);
            this.g = false;
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }
}
