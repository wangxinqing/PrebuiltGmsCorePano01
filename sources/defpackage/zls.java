package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;
import com.google.android.gms.plus.sharebox.MentionSpan;

/* renamed from: zls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zls extends Fragment implements View.OnClickListener, TextView.OnEditorActionListener {
    public boolean a;
    public boolean b;
    public zlr c;
    public View d;
    public ScrollView e;
    public MentionMultiAutoCompleteTextView f;
    private boolean g;
    private Button h;

    public final void a(boolean z) {
        this.h.setEnabled(z);
    }

    public final void b() {
        this.f.a(getLoaderManager(), this.c.b().f, this.c.d().b(), this.c.d().d() ? this.c.d().m : "80", this.c.getCallingPackage(), this.c.a());
        if (!this.g) {
            this.c.b().a(iax.b);
            this.g = true;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!TextUtils.isEmpty(this.c.d().h)) {
            this.f.setHint(this.c.d().h);
        }
        if (bundle == null && this.c.d().r != null) {
            String str = this.c.d().r.e;
            if (!TextUtils.isEmpty(str)) {
                SpannableStringBuilder append = new SpannableStringBuilder().append("+").append(this.c.d().r.f).append(" ");
                append.setSpan(new MentionSpan(str), 0, append.length() - 1, 33);
                this.f.setText(append);
                this.f.requestFocus();
                MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.f;
                mentionMultiAutoCompleteTextView.setSelection(mentionMultiAutoCompleteTextView.getText().length());
            }
        }
        if (!TextUtils.isEmpty(this.f.getText())) {
            MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView2 = this.f;
            mentionMultiAutoCompleteTextView2.setSelection(mentionMultiAutoCompleteTextView2.getText().length());
        }
        this.c.f();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof zlr)) {
            String valueOf = String.valueOf(zlr.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.c = (zlr) activity;
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.reply_button) {
            a(false);
            this.c.g();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.g = bundle.getBoolean("logged_expand_replybox", false);
            this.a = bundle.getBoolean("logged_comment_added", false);
            this.b = bundle.getBoolean("user_edited", false);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.plus_replybox_fragment, viewGroup, false);
        this.d = inflate;
        this.e = (ScrollView) inflate.findViewById(R.id.mention_scroll_view);
        Button button = (Button) this.d.findViewById(R.id.reply_button);
        this.h = button;
        button.setOnClickListener(this);
        Button button2 = this.h;
        if (bundle != null && bundle.getBoolean("button_enabled")) {
            z = true;
        }
        button2.setEnabled(z);
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = (MentionMultiAutoCompleteTextView) this.d.findViewById(R.id.compose_text);
        this.f = mentionMultiAutoCompleteTextView;
        mentionMultiAutoCompleteTextView.addTextChangedListener(new zlq(this, getResources()));
        this.f.setOnEditorActionListener(this);
        return this.d;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() != R.id.compose_text || i != 6) {
            return false;
        }
        jjw.a(getActivity(), textView);
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("logged_expand_replybox", this.g);
        bundle.putBoolean("logged_comment_added", this.a);
        bundle.putBoolean("user_edited", this.b);
        bundle.putBoolean("button_enabled", this.h.isEnabled());
    }

    public final void onStart() {
        super.onStart();
        if (this.c.b().d) {
            b();
        }
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.f.getText());
    }
}
