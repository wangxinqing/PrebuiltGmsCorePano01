package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;

/* renamed from: bsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bsg extends DialogFragment implements DialogInterface.OnClickListener {
    private DialogPreference a;
    public int b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence f;
    private int g;
    private BitmapDrawable h;

    /* access modifiers changed from: protected */
    public void a(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f;
            int i = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(sr srVar) {
    }

    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    public final DialogPreference b() {
        if (this.a == null) {
            this.a = (DialogPreference) ((alz) getTargetFragment()).a(getArguments().getString("key"));
        }
        return this.a;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof alz) {
            alz alz = (alz) targetFragment;
            String string = getArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) alz.a(string);
                this.a = dialogPreference;
                this.c = dialogPreference.a;
                this.d = dialogPreference.d;
                this.e = dialogPreference.e;
                this.f = dialogPreference.b;
                this.g = dialogPreference.f;
                Drawable drawable = dialogPreference.c;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    this.h = (BitmapDrawable) drawable;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                this.h = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.c = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.b = -2;
        sr srVar = new sr(activity);
        srVar.b(this.c);
        srVar.a((Drawable) this.h);
        srVar.b(this.d, (DialogInterface.OnClickListener) this);
        srVar.a(this.e, (DialogInterface.OnClickListener) this);
        int i = this.g;
        View view = null;
        if (i != 0) {
            view = LayoutInflater.from(activity).inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            a(view);
            srVar.b(view);
        } else {
            srVar.a(this.f);
        }
        a(srVar);
        ss b2 = srVar.b();
        if (a()) {
            b2.getWindow().setSoftInputMode(5);
        }
        return b2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a(this.b == -1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f);
        bundle.putInt("PreferenceDialogFragment.layout", this.g);
        BitmapDrawable bitmapDrawable = this.h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
