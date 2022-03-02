package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: gnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnp extends Fragment implements View.OnClickListener {
    private static final Pattern c = Pattern.compile("<placeholder\\s*id=['\"]app_name['\"]\\s*/?>(.*</placeholder>)?");
    private static final ArrayList d = new ArrayList();
    private static final Map e;
    public ScopeData a;
    public ArrayList b;
    private String f;
    private String g;
    private String h;
    private ArrayList i;
    private TextView j;
    private TextView k;
    private gno l;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("https://www.googleapis.com/auth/plus.me", Integer.valueOf(R.drawable.auth_consent_default_scope_icon));
        Integer valueOf = Integer.valueOf(R.drawable.plus_iconic_ic_gplus_color_24);
        hashMap.put("https://www.googleapis.com/auth/plus.circles.read", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.circles.write", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.stream.read", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.stream.write", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.media.upload", valueOf);
        hashMap.put("https://www.googleapis.com/auth/userinfo.email", Integer.valueOf(R.drawable.plus_iconic_ic_gmail_red_24));
        hashMap.put("https://www.googleapis.com/auth/youtube", Integer.valueOf(R.drawable.plus_iconic_ic_video_red_24));
        Integer valueOf2 = Integer.valueOf(R.drawable.plus_iconic_ic_play_games_color_24);
        hashMap.put("https://www.googleapis.com/auth/games", valueOf2);
        hashMap.put("https://www.googleapis.com/auth/games_lite", valueOf2);
        hashMap.put("https://www.googleapis.com/auth/payments.make_payments", Integer.valueOf(R.drawable.plus_iconic_ic_wallet_color_24));
        Integer valueOf3 = Integer.valueOf(R.drawable.auth_fitness_icn_scope_activity);
        hashMap.put("https://www.googleapis.com/auth/fitness.activity.read", valueOf3);
        hashMap.put("https://www.googleapis.com/auth/fitness.activity.write", valueOf3);
        Integer valueOf4 = Integer.valueOf(R.drawable.auth_fitness_icn_scope_location);
        hashMap.put("https://www.googleapis.com/auth/fitness.location.read", valueOf4);
        hashMap.put("https://www.googleapis.com/auth/fitness.location.write", valueOf4);
        Integer valueOf5 = Integer.valueOf(R.drawable.auth_fitness_icn_scope_sensor);
        hashMap.put("https://www.googleapis.com/auth/fitness.body.read", valueOf5);
        hashMap.put("https://www.googleapis.com/auth/fitness.body.write", valueOf5);
        Integer valueOf6 = Integer.valueOf(R.drawable.auth_fitness_icn_scope_nutrition);
        hashMap.put("https://www.googleapis.com/auth/fitness.nutrition.read", valueOf6);
        hashMap.put("https://www.googleapis.com/auth/fitness.nutrition.write", valueOf6);
        e = Collections.unmodifiableMap(hashMap);
    }

    public static gnp a(int i2, String str, String str2, String str3, ScopeData scopeData) {
        Bundle bundle = new Bundle();
        bundle.putInt("scope_index", i2);
        bundle.putString("app_name", str);
        bundle.putString("account_name", str2);
        bundle.putString("calling_package", str3);
        bundle.putParcelable("scope_data", scopeData);
        gnp gnp = new gnp();
        gnp.setArguments(bundle);
        return gnp;
    }

    private final void a(String str) {
        TextView textView = this.k;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.plus_auth_scope_fragment_circles_text));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, str.length(), 18);
        textView.setText(spannableStringBuilder);
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    super.onActivityResult(i2, i3, intent);
                } else if (i3 == -1) {
                    this.l.a(intent.getLongExtra("detail_end_time", 0) - intent.getLongExtra("detail_start_time", 0));
                    this.l.a(intent.getBooleanExtra("detail_screen_scrollable", false), intent.getBooleanExtra("scroll_screen_end", false));
                }
            } else if (i3 == -1) {
                iia a2 = iig.a(intent);
                this.i = a2.c();
                this.a.n = a2.a();
                this.a.o = a2.b();
                this.a.h = a();
            }
        } else if (intent != null) {
            ArrayList arrayList = new ArrayList(((Audience) intent.getParcelableExtra("pacl_audience")).b);
            this.b = arrayList;
            a(a(arrayList));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.l = (gno) activity;
        } catch (ClassCastException e2) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnScopeDetailsSelectedListener"));
        }
    }

    public void onClick(View view) {
        if (this.a.a()) {
            String a2 = a(this.a.d, this.f);
            String str = this.g;
            String str2 = this.h;
            ScopeData scopeData = this.a;
            iww iww = new iww();
            iww.a((Collection) this.b);
            Audience a3 = iww.a();
            Intent className = new Intent().setClassName(ihs.b(), "com.google.android.gms.auth.uiflows.consent.AuthAudienceViewActivity");
            className.putExtra("scope_description", a2);
            className.putExtra("account_name", str);
            className.putExtra("calling_package", str2);
            className.putExtra("scope_data", scopeData);
            className.putExtra("pacl_audience", a3);
            startActivityForResult(className, 1);
            return;
        }
        ScopeData scopeData2 = this.a;
        if (scopeData2.g) {
            iia a4 = iig.a();
            a4.a(this.g);
            a4.b((List) this.i);
            a4.b(a(this.a.i, this.f));
            a4.c(this.a.k);
            a4.d(this.a.l);
            a4.e(this.a.m);
            a4.a(this.a.n);
            a4.b(this.a.o);
            a4.d("80");
            Intent intent = a4.a;
            if (!getActivity().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                startActivityForResult(intent, 2);
                return;
            }
            return;
        }
        String str3 = scopeData2.d;
        String str4 = this.h;
        Intent className2 = new Intent().setClassName(ihs.b(), "com.google.android.gms.auth.uiflows.consent.AuthScopeDetailsActivity");
        className2.putExtra("scope_details", str3);
        className2.putExtra("calling_package", str4);
        startActivityForResult(className2, 3);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f = arguments.getString("app_name");
        this.g = arguments.getString("account_name");
        arguments.getInt("scope_index");
        this.h = arguments.getString("calling_package");
        if (bundle != null) {
            this.i = bundle.getParcelableArrayList("facl_audience");
            this.b = bundle.getParcelableArrayList("pacl_audience");
            this.a = (ScopeData) bundle.getParcelable("scope_data");
            return;
        }
        this.a = (ScopeData) arguments.getParcelable("scope_data");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ArrayList arrayList = null;
        View inflate = layoutInflater.inflate(R.layout.auth_consent_scope_fragment, (ViewGroup) null);
        this.j = (TextView) inflate.findViewById(R.id.scope_description_label);
        this.k = (TextView) inflate.findViewById(R.id.pacl_visible_circles);
        this.j.setText(Html.fromHtml(this.a.c.trim().replaceAll("\n", "<br/>")));
        this.j.setMovementMethod(LinkMovementMethod.getInstance());
        this.j.setClickable(true);
        this.j.setOnClickListener(this);
        inflate.findViewById(R.id.scope_fragment_layout).setOnClickListener(this);
        Resources resources = getResources();
        if (this.a.a()) {
            ((ImageView) inflate.findViewById(R.id.scope_icon)).setImageDrawable(resources.getDrawable(R.drawable.auth_pacl_icon));
            inflate.findViewById(R.id.scope_details_icon).setVisibility(0);
            this.k.setVisibility(0);
            if (this.b == null) {
                String str = this.a.f;
                if (str != null) {
                    try {
                        arrayList = new ArrayList(yxf.a(jhy.c(str)));
                    } catch (Exception e2) {
                        Log.e("AuthScopeFragment", str.length() == 0 ? new String("Failed to parse audience from roster: ") : "Failed to parse audience from roster: ".concat(str), e2);
                        arrayList = new ArrayList();
                        arrayList.add(AudienceMember.c("myCircles", getResources().getString(R.string.common_chips_label_your_circles)));
                    }
                }
                this.b = arrayList;
            }
            a(a(this.b));
        } else {
            ScopeData scopeData = this.a;
            if (scopeData.g) {
                ((ImageView) inflate.findViewById(R.id.scope_icon)).setImageDrawable(resources.getDrawable(R.drawable.plus_icn_scope_icon_facl));
                inflate.findViewById(R.id.scope_details_icon).setVisibility(0);
                if (this.i == null) {
                    String str2 = this.a.h;
                    ArrayList arrayList2 = d;
                    if (TextUtils.isEmpty(str2)) {
                        arrayList2 = new ArrayList();
                    } else {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            String[] split = str2.split(" ");
                            for (String parseLong : split) {
                                arrayList3.add(AudienceMember.b(Long.toHexString(Long.parseLong(parseLong)), (String) null));
                            }
                            if (!arrayList3.isEmpty()) {
                                arrayList2 = arrayList3;
                            }
                        } catch (NumberFormatException e3) {
                            Log.e("AuthScopeFragment", "Failed to parse audience from circle ID list.", e3);
                        }
                        this.a.n = true;
                    }
                    this.i = arrayList2;
                }
                if (this.a.b() && this.a.j) {
                    TextView textView = (TextView) inflate.findViewById(R.id.warning);
                    textView.setVisibility(0);
                    textView.setText(this.a.c());
                }
            } else if (scopeData.b()) {
                TextView textView2 = (TextView) inflate.findViewById(R.id.warning);
                textView2.setVisibility(0);
                textView2.setText(this.a.c());
            }
        }
        if (e.get(this.a.q) != null) {
            ((ImageView) inflate.findViewById(R.id.scope_icon)).setImageDrawable(resources.getDrawable(((Integer) e.get(this.a.q)).intValue()));
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("app_name", this.f);
        bundle.putString("account_name", this.g);
        bundle.putParcelable("scope_data", this.a);
        bundle.putParcelableArrayList("pacl_audience", this.b);
        bundle.putParcelableArrayList("facl_audience", this.i);
    }

    private static final String a(String str, String str2) {
        iva.a((Object) str);
        iva.a((Object) str2);
        return c.matcher(str).replaceAll(str2);
    }

    private final String a(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return getString(R.string.common_chips_label_only_you);
        }
        AudienceMember audienceMember = null;
        AudienceMember audienceMember2 = null;
        AudienceMember audienceMember3 = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AudienceMember audienceMember4 = (AudienceMember) arrayList.get(i2);
            if (audienceMember4.b == 1) {
                int i3 = audienceMember4.c;
                if (i3 == 1) {
                    audienceMember = audienceMember4;
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        audienceMember2 = audienceMember4;
                    }
                } else if (audienceMember4.b()) {
                    audienceMember3 = audienceMember4;
                }
            }
        }
        if (audienceMember != null) {
            return getString(R.string.auth_plus_scope_fragment_public_label);
        }
        if (audienceMember2 != null) {
            return getString(R.string.auth_plus_scope_fragment_extended_circles_label);
        }
        if (audienceMember3 != null) {
            return getString(R.string.common_chips_label_your_circles);
        }
        if (arrayList.size() == 1) {
            return ((AudienceMember) arrayList.get(0)).f;
        }
        return getString(R.string.auth_plus_scope_fragment_mixed_label);
    }

    public final String a() {
        long j2;
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                String str = ((AudienceMember) arrayList.get(i2)).d;
                if (str.length() <= 16) {
                    if (str.length() != 16) {
                        j2 = Long.parseLong(str, 16);
                    } else {
                        j2 = (Long.parseLong(str.substring(0, 8), 16) << 32) | Long.parseLong(str.substring(8), 16);
                    }
                    sb.append(Long.toString(j2));
                    i2++;
                    if (i2 < size) {
                        sb.append(" ");
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37);
                    sb2.append("Invalid input: ");
                    sb2.append(str);
                    sb2.append(" exceeds 16 characters");
                    throw new NumberFormatException(sb2.toString());
                }
            }
            return sb.toString();
        } catch (Exception e2) {
            Log.e("AuthScopeFragment", "Failed to convert audience to circle ID list", e2);
            return null;
        }
    }
}
