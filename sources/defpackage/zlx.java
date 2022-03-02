package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: zlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zlx extends Fragment implements TextView.OnEditorActionListener, TextWatcher, LoaderManager.LoaderCallbacks, yqc {
    public zmq a;
    public yny b;
    public yok c;
    private ypc d;
    private EditText e;

    private final void a(boolean z) {
        int i;
        if (getView() != null) {
            View findViewById = getView().findViewById(R.id.acl_fragment_container);
            Resources resources = getResources();
            if (!z) {
                i = R.color.plus_solid_white;
            } else {
                i = R.color.plus_sharebox_search_background;
            }
            findViewById.setBackgroundColor(resources.getColor(i));
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable.toString())) {
            a();
            return;
        }
        getChildFragmentManager().beginTransaction().show(this.c).hide(this.b).commitAllowingStateLoss();
        this.a.h().a(3);
        a(true);
        this.c.a(editable.toString());
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof zmq)) {
            String valueOf = String.valueOf(zmq.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.a = (zmq) activity;
        if (activity instanceof ypc) {
            this.d = (ypc) activity;
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 0) {
            return new yri(getActivity(), this.a.g().j, this.a.j().b(), this.a.j().m, this.a.getCallingPackage());
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.plus_sharebox_acl_selection_fragment, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.e.removeTextChangedListener(this);
        this.e.setOnEditorActionListener((TextView.OnEditorActionListener) null);
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
        getLoaderManager().destroyLoader(0);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        jjw.a(getActivity(), this.e);
        return true;
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            a();
            this.a.h().a(true);
            ypc ypc = this.d;
            if (ypc != null && ypc.m() != null) {
                this.d.m().a(this);
                return;
            }
            return;
        }
        ypc ypc2 = this.d;
        if (ypc2 != null && ypc2.m() != null) {
            this.d.m().b(this);
        }
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        xfh xfh = (xfh) obj;
        if (loader.getId() == 0) {
            Status status = ((yri) loader).f;
            if (status.c() && xfh != null && xfh.a() == 1) {
                this.b.a(xfh.a(0));
                return;
            }
            this.a.a(new ConnectionResult(status.i, status.k));
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        yny yny = this.b;
        if (yny != null) {
            bundle.putBoolean("selection_hidden", yny.isHidden());
        }
        yok yok = this.c;
        if (yok != null) {
            bundle.putBoolean("search_hidden", yok.isHidden());
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        EditText editText = (EditText) getView().findViewById(R.id.plus_sharebox_searchbox);
        this.e = editText;
        editText.setOnEditorActionListener(this);
        this.e.addTextChangedListener(this);
        this.e.setHint(R.string.plus_sharebox_search_hint);
        this.e.setInputType(97);
        FragmentManager childFragmentManager = getChildFragmentManager();
        this.b = (yny) childFragmentManager.findFragmentByTag("selection");
        this.c = (yok) childFragmentManager.findFragmentByTag("search");
        if (bundle != null) {
            ypc ypc = this.d;
            if (!(ypc == null || ypc.m() == null)) {
                this.d.m().a(this);
            }
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            if (this.b != null) {
                if (bundle.getBoolean("selection_hidden")) {
                    beginTransaction.hide(this.b);
                } else {
                    beginTransaction.show(this.b);
                    a(false);
                }
            }
            if (this.c != null) {
                if (bundle.getBoolean("search_hidden")) {
                    beginTransaction.hide(this.c);
                } else {
                    beginTransaction.show(this.c);
                    a(true);
                }
            }
            if (!beginTransaction.isEmpty()) {
                beginTransaction.commit();
            }
        }
    }

    public final void a() {
        getChildFragmentManager().beginTransaction().show(this.b).hide(this.c).commitAllowingStateLoss();
        jjw.a(getActivity(), this.e);
        if (!TextUtils.isEmpty(this.e.getText())) {
            this.e.setText((CharSequence) null);
        }
        this.a.h().a(2);
        a(false);
    }

    public final void a(Object obj) {
        if (!ixb.a(this.d.m().a) && this.b.isHidden()) {
            a();
        }
    }
}
