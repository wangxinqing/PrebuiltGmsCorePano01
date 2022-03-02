package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: zae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zae extends Fragment implements View.OnClickListener, ica, icb {
    public static final String[] a = {"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/pos", "https://www.googleapis.com/auth/plus.stream.write"};
    public String b;
    public String c;
    public String d;
    public String e;
    public yuv f;
    public ysw g;
    public ysy h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ProgressBar m;
    public ConnectionResult n;
    public final yup o = new zac(this);
    private boolean p;
    private final yui q = yuv.a;
    private boolean r;
    private boolean s;
    private PlusCommonExtras t;
    private final yup u = new zaa(this);
    private final yut v = new zad(this);
    private final zab w = new zab(this);

    private final void a(boolean z) {
        getView().findViewById(R.id.plus_one_content).setVisibility(!z ? 4 : 0);
    }

    public final void a(int i2) {
    }

    public final void g(Bundle bundle) {
        Activity activity;
        String str = this.d;
        if (str == null) {
            this.d = this.f.a();
        } else if (!str.equals(this.f.a())) {
            Activity activity2 = getActivity();
            if (activity2 != null) {
                activity2.showDialog(1);
                return;
            }
            return;
        }
        if (!this.s && (activity = getActivity()) != null) {
            this.s = true;
            izr.a((Context) activity, this.d, (String) null, ylm.f, yln.b, this.c);
            izr.a(activity, this.d, yln.b, yln.a, this.c);
        }
        if (this.i) {
            this.j = true;
            if (TextUtils.isEmpty(this.e)) {
                this.f.a(this.u, this.b);
            } else {
                this.i = false;
                this.f.a(this.o, this.b, this.e);
            }
        }
        if (this.g == null) {
            this.k = true;
            this.f.a(this.w, this.b);
        }
        if (this.h == null) {
            this.l = true;
            this.f.a(this.v);
        }
        a(true);
        a(this.m);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        PackageManager packageManager = getActivity().getPackageManager();
        ImageView imageView = (ImageView) getView().findViewById(R.id.plus_one_app_icon);
        TextView textView = (TextView) getView().findViewById(R.id.plus_one_app_name);
        try {
            imageView.setImageDrawable(packageManager.getApplicationIcon(this.c));
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.c, 0));
            textView.setText(Html.fromHtml(getResources().getString(R.string.plus_one_app, new Object[]{applicationLabel})));
        } catch (PackageManager.NameNotFoundException e2) {
            textView.setVisibility(4);
            imageView.setVisibility(4);
        }
        getView().findViewById(R.id.plus_one_undo_button).setOnClickListener(this);
        getView().findViewById(R.id.plus_one_share_button).setOnClickListener(this);
        getView().findViewById(R.id.plus_one_confirm_button).setOnClickListener(this);
        a(this.f.l());
        a(this.h);
        a(this.g);
        a(this.m);
        this.t = PlusCommonExtras.b(getArguments());
        ykr.a(getActivity(), this.t, "gppo0");
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        Intent intent;
        boolean z3;
        Activity activity = getActivity();
        if (activity != null && this.f.l()) {
            int id = view.getId();
            int i2 = -1;
            if (id == R.id.plus_one_undo_button) {
                if (this.p) {
                    izr.a((Context) activity, this.d, (String) null, ylm.b, yln.a, this.c);
                } else {
                    izr.a((Context) activity, this.d, (String) null, ylm.c, yln.a, this.c);
                }
                izr.a(activity, this.d, yln.a, yln.b, this.c);
                this.f.b((yup) null, this.b);
                if (this.p) {
                    i2 = 0;
                }
                activity.setResult(i2);
                activity.finish();
            } else if (id == R.id.plus_one_share_button) {
                izr.a((Context) activity, this.d, (String) null, ylm.g, yln.a, this.c);
                izr.a(activity, this.d, yln.a, yln.c, this.c);
                yks yks = new yks();
                yks.a.putExtra("android.intent.extra.TEXT", this.b);
                yks.a.setType("text/plain");
                boolean equals = "android.intent.action.SEND_MULTIPLE".equals(yks.a.getAction());
                boolean booleanExtra = yks.a.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
                iva.a(true, (Object) "Call-to-action buttons are only available for URLs.");
                if (!booleanExtra || yks.a.hasExtra("com.google.android.apps.plus.CONTENT_URL")) {
                    z = true;
                } else {
                    z = false;
                }
                iva.a(z, (Object) "The content URL is required for interactive posts.");
                if (!booleanExtra || yks.a.hasExtra("com.google.android.apps.plus.CONTENT_URL") || yks.a.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iva.a(z2, (Object) "Must set content URL or content deep-link ID to use a call-to-action button.");
                if (yks.a.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")) {
                    String stringExtra = yks.a.getStringExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
                    if (TextUtils.isEmpty(stringExtra)) {
                        Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
                        z3 = false;
                    } else if (stringExtra.contains(" ")) {
                        Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    iva.a(z3, (Object) "The specified deep-link ID was malformed.");
                }
                if (equals) {
                    yks.a.setAction("android.intent.action.SEND");
                    yks.a.removeExtra("android.intent.extra.STREAM");
                }
                if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(yks.a.getAction())) {
                    yks.a.setPackage("com.google.android.gms");
                    intent = yks.a;
                } else if (!yks.a.hasExtra("android.intent.extra.STREAM")) {
                    yks.a.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
                    yks.a.setPackage("com.google.android.gms");
                    intent = yks.a;
                } else {
                    yks.a.setPackage("com.google.android.apps.plus");
                    intent = yks.a;
                }
                intent.putExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", this.c);
                intent.putExtra("com.google.android.apps.plus.IS_FROM_PLUSONE", true);
                this.t.a(intent);
                startActivity(intent);
                if (!this.p) {
                    i2 = 0;
                }
                activity.setResult(i2);
                activity.finish();
            } else if (id == R.id.plus_one_confirm_button) {
                if (this.p) {
                    izr.a((Context) activity, this.d, (String) null, ylm.a, yln.a, this.c);
                } else {
                    izr.a((Context) activity, this.d, (String) null, ylm.d, yln.a, this.c);
                }
                izr.a(activity, this.d, yln.a, yln.b, this.c);
                if (!this.p) {
                    i2 = 0;
                }
                activity.setResult(i2);
                activity.finish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments.getString("PlusOneFragment#mAccount");
        this.e = arguments.getString("PlusOneFragment#mToken");
        this.p = arguments.getBoolean("PlusOneFragment#mApplyPlusOne");
        this.b = arguments.getString("PlusOneFragment#mUrl");
        this.c = arguments.getString("PlusOneFragment#mCallingPackage");
        Activity activity = getActivity();
        ywh ywh = new ywh(activity);
        ywh.a = string;
        ywh.a(a);
        ywh.c = this.c;
        ywh.b = activity.getPackageName();
        this.f = this.q.a(activity, ywh.a(), this, this);
        this.j = false;
        this.k = false;
        this.l = false;
        if (bundle == null) {
            this.i = this.p;
            this.r = false;
            this.s = false;
            activity.setResult(0);
            return;
        }
        this.i = bundle.getBoolean("pendingInsert");
        this.r = bundle.getBoolean("loggedPreview");
        this.s = bundle.getBoolean("loggedPlusOne");
        if (bundle.containsKey("account")) {
            this.d = bundle.getString("account");
        }
        if (bundle.containsKey("token")) {
            this.e = bundle.getString("token");
        }
        if (bundle.containsKey("linkPreview")) {
            this.g = new ysw(bundle.getBundle("linkPreview"));
        }
        if (bundle.containsKey("signUpState")) {
            this.h = new ysy(bundle.getBundle("signUpState"));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.plus_one_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        ConnectionResult connectionResult = this.n;
        if (connectionResult != null) {
            try {
                connectionResult.a(getActivity().getContainerActivity());
            } catch (IntentSender.SendIntentException e2) {
                this.n = null;
                getActivity().showDialog(1);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pendingInsert", this.i);
        bundle.putBoolean("loggedPreview", this.r);
        bundle.putBoolean("loggedPlusOne", this.s);
        String str = this.d;
        if (str != null) {
            bundle.putString("account", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            bundle.putString("token", str2);
        }
        ysw ysw = this.g;
        if (ysw != null) {
            bundle.putBundle("linkPreview", ysw.d());
        }
        ysy ysy = this.h;
        if (ysy != null) {
            bundle.putBundle("signUpState", ysy.a);
        }
    }

    public final void onStart() {
        super.onStart();
        this.n = null;
        this.f.t();
        a(this.m);
    }

    public final void onStop() {
        super.onStop();
        this.f.j();
    }

    public final void a() {
        int i2;
        Activity activity = getActivity();
        if (activity != null && this.f.l()) {
            if (this.p) {
                izr.a((Context) activity, this.d, (String) null, ylm.a, yln.a, this.c);
            } else {
                izr.a((Context) activity, this.d, (String) null, ylm.d, yln.a, this.c);
            }
            izr.a(activity, this.d, yln.a, yln.b, this.c);
            if (!this.p) {
                i2 = 0;
            } else {
                i2 = -1;
            }
            activity.setResult(i2);
        }
    }

    public final void a(ProgressBar progressBar) {
        if (progressBar != null) {
            int i2 = 0;
            if (this.f.l() && !this.j && !this.k && !this.l) {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
        }
    }

    public final void a(ConnectionResult connectionResult) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (!connectionResult.a()) {
            activity.showDialog(1);
        } else if (isResumed()) {
            try {
                connectionResult.a(getActivity().getContainerActivity());
            } catch (IntentSender.SendIntentException e2) {
                activity.showDialog(1);
            }
        } else {
            this.n = connectionResult;
        }
    }

    public final void a(ysw ysw) {
        View view;
        ysw ysw2 = ysw;
        Activity activity = getActivity();
        if (activity != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.plus_one_preview_container);
            viewGroup.removeAllViews();
            zaf zaf = new zaf(activity);
            zaf.b = this.f;
            amrl.a((Object) zaf.b, (Object) "Call initialize first");
            zaf.a = ysw2;
            zaf.removeAllViews();
            ysw ysw3 = zaf.a;
            boolean z = false;
            if (ysw3 != null) {
                String a2 = ysw3.a();
                if ("article".equals(a2)) {
                    view = LayoutInflater.from(zaf.getContext()).inflate(R.layout.plus_article_preview_view, (ViewGroup) null);
                    PlusImageView plusImageView = (PlusImageView) view.findViewById(R.id.article_icon);
                    plusImageView.a(zaf.b);
                    TextView textView = (TextView) view.findViewById(R.id.article_title);
                    TextView textView2 = (TextView) view.findViewById(R.id.article_content);
                    PlusImageView plusImageView2 = (PlusImageView) view.findViewById(R.id.article_image);
                    plusImageView2.a(zaf.b);
                    String a3 = zaf.a(zaf.a.b());
                    String a4 = zaf.a(zaf.a.b.getAsString("description"));
                    String c2 = zaf.a.c();
                    if (!TextUtils.isEmpty(a3)) {
                        textView.setVisibility(0);
                        textView.setText(a3);
                    } else {
                        textView.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(a4)) {
                        textView2.setVisibility(0);
                        textView2.setText(a4);
                    } else {
                        textView2.setVisibility(8);
                    }
                    plusImageView.setVisibility(8);
                    if (!TextUtils.isEmpty(c2)) {
                        plusImageView2.setVisibility(0);
                        plusImageView2.a(ytz.a(c2));
                    } else {
                        plusImageView2.setVisibility(8);
                    }
                    view.setVisibility(0);
                } else if ("video".equals(a2)) {
                    view = LayoutInflater.from(zaf.getContext()).inflate(R.layout.plus_video_preview_view, (ViewGroup) null);
                    TextView textView3 = (TextView) view.findViewById(R.id.video_title);
                    PlusImageView plusImageView3 = (PlusImageView) view.findViewById(R.id.video_image);
                    plusImageView3.a(zaf.b);
                    String c3 = zaf.a.c();
                    String a5 = zaf.a(zaf.a.b());
                    if (!TextUtils.isEmpty(a5)) {
                        textView3.setVisibility(0);
                        textView3.setText(a5);
                    } else {
                        textView3.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(c3)) {
                        plusImageView3.setVisibility(0);
                        plusImageView3.a(ytz.a(c3));
                    } else {
                        plusImageView3.setVisibility(8);
                    }
                    view.setVisibility(0);
                } else if (!"photo".equals(a2)) {
                    String valueOf = String.valueOf(a2);
                    Log.e("PreviewView", valueOf.length() == 0 ? new String("Unsupported content type:") : "Unsupported content type:".concat(valueOf));
                } else {
                    view = LayoutInflater.from(zaf.getContext()).inflate(R.layout.plus_photo_preview_view, (ViewGroup) null);
                    TextView textView4 = (TextView) view.findViewById(R.id.photo_title);
                    PlusImageView plusImageView4 = (PlusImageView) view.findViewById(R.id.photo_image);
                    plusImageView4.a(zaf.b);
                    String c4 = zaf.a.c();
                    String a6 = zaf.a(zaf.a.b());
                    if (!TextUtils.isEmpty(a6)) {
                        textView4.setVisibility(0);
                        textView4.setText(a6);
                    } else {
                        textView4.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(c4)) {
                        plusImageView4.setVisibility(0);
                        plusImageView4.a(ytz.a(c4));
                    } else {
                        plusImageView4.setVisibility(8);
                    }
                    view.setVisibility(0);
                }
                zaf.addView(view);
                zaf.invalidate();
                zaf.requestLayout();
                z = true;
            }
            if (!this.r && ysw2 != null) {
                this.r = true;
                if (z) {
                    izr.a((Context) activity, this.d, (String) null, ylm.e, yln.a, this.c);
                } else {
                    izr.a((Context) activity, this.d, (String) null, ylm.h, yln.a, this.c);
                }
            }
            viewGroup.addView(zaf);
        }
    }

    public final void a(ysy ysy) {
        if (ysy != null) {
            PlusImageView plusImageView = (PlusImageView) getView().findViewById(R.id.plus_one_user_avatar);
            plusImageView.a(this.f);
            plusImageView.a(new Uri.Builder().scheme("content").authority("com.google.android.gms.plus").appendPath("avatars").appendPath(this.f.a()).build());
            ((TextView) getView().findViewById(R.id.plus_one_user_name)).setText(ysy.a());
        }
    }
}
