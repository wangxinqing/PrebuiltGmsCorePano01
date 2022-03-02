package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bso extends Fragment implements amx, amv, amw, alz {
    public amy a;
    public RecyclerView b;
    private boolean c;
    private boolean d;
    private Context e;
    private int f = R.layout.preference_list_fragment;
    private final bsk g = new bsk(this);
    private final Handler h = new bsi(this);
    private final Runnable i = new bsj(this);

    public final Preference a(CharSequence charSequence) {
        amy amy = this.a;
        if (amy != null) {
            return amy.a(charSequence);
        }
        return null;
    }

    public final PreferenceScreen b() {
        return this.a.c;
    }

    public final void c() {
        PreferenceScreen b2 = b();
        if (b2 != null) {
            this.b.setAdapter(new amt(b2));
            b2.m();
        }
    }

    public abstract void d();

    public final void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen b2;
        super.onActivityCreated(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (b2 = b()) != null) {
            b2.b(bundle2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 > 0) {
            this.e = new ContextThemeWrapper(getActivity(), i2);
            amy amy = new amy(this.e);
            this.a = amy;
            amy.f = this;
            if (getArguments() != null) {
                getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
            }
            d();
            return;
        }
        throw new IllegalStateException("Must specify preferenceTheme in theme");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes((AttributeSet) null, bsp.a, R.attr.preferenceFragmentCompatStyle, 0);
        this.f = obtainStyledAttributes.getResourceId(0, this.f);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), typedValue.resourceId));
        View inflate = cloneInContext.inflate(this.f, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            getActivity();
            recyclerView.setLayoutManager(new abk());
            recyclerView.setAccessibilityDelegateCompat(new ana(recyclerView));
            if (recyclerView != null) {
                this.b = recyclerView;
                recyclerView.addItemDecoration(this.g);
                bsk bsk = this.g;
                if (drawable != null) {
                    bsk.b = drawable.getIntrinsicHeight();
                } else {
                    bsk.b = 0;
                }
                bsk.a = drawable;
                bsk.c.b.invalidateItemDecorations();
                if (dimensionPixelSize != -1) {
                    bsk bsk2 = this.g;
                    bsk2.b = dimensionPixelSize;
                    bsk2.c.b.invalidateItemDecorations();
                }
                viewGroup2.addView(this.b);
                this.h.post(this.i);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public final void onDestroyView() {
        PreferenceScreen b2;
        this.h.removeCallbacks(this.i);
        this.h.removeMessages(1);
        if (this.c && (b2 = b()) != null) {
            b2.n();
        }
        this.b = null;
        super.onDestroyView();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen b2 = b();
        if (b2 != null) {
            Bundle bundle2 = new Bundle();
            b2.a(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public final void onStart() {
        super.onStart();
        amy amy = this.a;
        amy.d = this;
        amy.e = this;
    }

    public final void onStop() {
        super.onStop();
        amy amy = this.a;
        amy.d = null;
        amy.e = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.c) {
            c();
        }
        this.d = true;
    }

    public final void a() {
        if (getActivity() instanceof bsn) {
            ((bsn) getActivity()).a();
        }
    }

    public final boolean b(Preference preference) {
        if (preference.v == null || !(getActivity() instanceof bsm)) {
            return false;
        }
        return ((bsm) getActivity()).a();
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2) {
        amy amy = this.a;
        if (amy != null) {
            Context context = this.e;
            PreferenceScreen b2 = b();
            amy.a(true);
            amu amu = new amu(context, amy);
            XmlResourceParser xml = amu.a.getResources().getXml(i2);
            try {
                Preference a2 = amu.a((XmlPullParser) xml, (PreferenceGroup) b2);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) a2;
                preferenceScreen.a(amy);
                amy.a(false);
                amy amy2 = this.a;
                PreferenceScreen preferenceScreen2 = amy2.c;
                if (preferenceScreen != preferenceScreen2) {
                    if (preferenceScreen2 != null) {
                        preferenceScreen2.n();
                    }
                    amy2.c = preferenceScreen;
                    if (preferenceScreen != null) {
                        this.c = true;
                        if (this.d && !this.h.hasMessages(1)) {
                            this.h.obtainMessage(1).sendToTarget();
                        }
                    }
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } else {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public final void a(Preference preference) {
        DialogFragment dialogFragment;
        if ((!(getActivity() instanceof bsl) || !((bsl) getActivity()).a()) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.t;
                dialogFragment = new bsd();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                dialogFragment.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.t;
                dialogFragment = new bsf();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                dialogFragment.setArguments(bundle2);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragment.setTargetFragment(this, 0);
            dialogFragment.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }
}
