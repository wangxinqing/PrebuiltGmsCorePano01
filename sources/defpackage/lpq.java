package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.ui.select.SelectFilePreferences;
import com.google.android.gms.drive.ui.select.Selection;
import com.google.android.gms.drive.ui.select.path.DriveIdPathElement;
import com.google.android.gms.drive.ui.select.path.PathElement;
import com.google.android.gms.drive.ui.select.path.PathStack;
import com.google.android.gms.drive.ui.select.path.SearchPathElement;
import com.google.android.gms.drive.ui.select.path.ViewPathElement;
import com.google.android.gms.drive.ui.select.view.FileListView;

/* renamed from: lpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lpq extends lnz implements loo, lpw, lqf, lpu {
    public static final ith a = new ith("SelectFileFragment", "");
    private MenuItem A;
    private MenuItem B;
    private MenuItem C;
    private final lph D = new lph(this);
    private final lpi E = new lpi(this);
    private final lpl F = new lpl(this);
    public final Runnable b = new lpk(this);
    public final Runnable c = new lpe(this);
    public final icm d = new lpm(this);
    public String e;
    public boolean f;
    public icc g;
    public PathStack h;
    public Selection i;
    public low j;
    public lfq k;
    public sg l;
    public SwipeRefreshLayout m;
    public FileListView n;
    private final acy o = new lpj(this);
    private final icm p = new lpn(this);
    private SelectFilePreferences q;
    private abk r;
    private lqa s;
    private Bundle t;
    private lfs u;
    private TextView v;
    private TextView w;
    private Button x;
    private MenuItem y;
    private SearchView z;

    private final void a(String str) {
        MenuItem menuItem = this.y;
        if (menuItem != null) {
            if (!menuItem.isActionViewExpanded()) {
                this.y.expandActionView();
            }
            if (!str.equals(this.z.d().toString())) {
                this.z.a(str, false);
            }
        }
    }

    private final void e() {
        MenuItem menuItem = this.y;
        if (menuItem != null && menuItem.isActionViewExpanded()) {
            this.y.collapseActionView();
        }
    }

    private final void f() {
        MenuItem menuItem = this.A;
        if (menuItem != null) {
            menuItem.setVisible(this.h.b() instanceof DriveIdPathElement);
        }
    }

    private final void g() {
        if (this.B != null) {
            PathElement b2 = this.h.b();
            boolean booleanValue = ((Boolean) jzq.Q.c()).booleanValue();
            PathElement pathElement = PathStack.b;
            boolean z2 = false;
            if (!(!booleanValue || b2 == null || b2 == pathElement)) {
                z2 = true;
            }
            this.B.setVisible(z2);
        }
    }

    public final void b() {
        MenuItem menuItem = this.y;
        icc icc = this.g;
        boolean z2 = false;
        if (icc != null && icc.i()) {
            z2 = true;
        }
        if (menuItem != null) {
            menuItem.setEnabled(z2);
            menuItem.getIcon().setAlpha((int) ((!z2 ? 0.6f : 1.0f) * 255.0f));
        }
    }

    public final void c() {
        this.x.setEnabled(this.i.d != null);
    }

    public final void d() {
        icc icc = this.g;
        boolean z2 = false;
        if (!(icc == null || !icc.i() || this.h.b() == PathStack.b)) {
            z2 = true;
        }
        MenuItem menuItem = this.C;
        if (menuItem != null) {
            menuItem.setVisible(z2);
        }
        this.m.setEnabled(z2);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        icc icc = ((lnx) getActivity()).a;
        this.g = icc;
        low low = this.j;
        iva.a((Object) icc);
        low.j = icc;
        low.l.a((lqf) low);
        low.m.a((lpu) low);
        this.h.a((lqf) this);
        this.i.a((lpu) this);
    }

    public final void onCreate(Bundle bundle) {
        PathStack pathStack;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.e = arguments.getString("callerSdkAppId");
        DriveId driveId = (DriveId) arguments.getParcelable("initialFolderId");
        this.f = arguments.getBoolean("authorizeResource", false);
        if (bundle != null) {
            this.h = (PathStack) bundle.getParcelable("pathStack");
            this.i = (Selection) bundle.getParcelable("selection");
            this.q = (SelectFilePreferences) bundle.getParcelable("preferences");
            this.t = bundle.getBundle("logSessionState");
            return;
        }
        if (driveId == null) {
            pathStack = new PathStack(PathStack.a((PathElement) lqj.a));
        } else {
            pathStack = new PathStack(driveId);
        }
        this.h = pathStack;
        this.i = new Selection(((FilterHolder) arguments.getParcelable("filterHolder")).j, driveId);
        this.q = new SelectFilePreferences();
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.drive_select_file_dialog, menu);
        this.y = menu.findItem(R.id.drive_menu_search);
        this.A = menu.findItem(R.id.drive_menu_create_folder);
        this.B = menu.findItem(R.id.drive_menu_sort);
        this.C = menu.findItem(R.id.drive_menu_refresh);
        this.y.setVisible(((Boolean) jzq.P.c()).booleanValue());
        SearchView searchView = (SearchView) pk.a(this.y);
        this.z = searchView;
        ((TextView) searchView.findViewById(R.id.search_src_text)).setHint(getString(R.string.common_search_settings_title));
        this.y.setOnActionExpandListener(new lpo(this));
        this.z.m = new lpp(this);
        PathElement b2 = this.h.b();
        if (b2 instanceof SearchPathElement) {
            a(((SearchPathElement) b2).a);
        }
        b();
        f();
        g();
        d();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.drive_select_file_dialog, viewGroup, false);
        ((lnx) getActivity()).a((Toolbar) inflate.findViewById(R.id.drive_select_file_dialog_toolbar));
        sg aE = ((lnx) getActivity()).aE();
        this.l = aE;
        aE.a((int) R.layout.drive_action_bar_view);
        this.l.n();
        this.l.c(false);
        this.l.a(false);
        View a2 = this.l.a();
        TextView textView = (TextView) a2.findViewById(R.id.action_bar_title);
        this.v = textView;
        textView.setText(getArguments().getString("dialogTitle"));
        this.w = (TextView) a2.findViewById(R.id.action_bar_folder);
        a(true);
        lpg lpg = new lpg(this);
        Button button = (Button) inflate.findViewById(R.id.drive_button_bar_button_right);
        this.x = button;
        button.setOnClickListener(lpg);
        this.x.setText(getString(R.string.common_select));
        this.x.setEnabled(false);
        Button button2 = (Button) inflate.findViewById(R.id.drive_button_bar_button_left);
        button2.setOnClickListener(lpg);
        button2.setText(17039360);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.drive_select_file_dialog_swipe_refresh);
        this.m = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(false);
        this.m.a(R.color.drive_Blue, R.color.drive_Green, R.color.drive_Yellow);
        this.m.a = new lpf(this);
        this.n = (FileListView) inflate.findViewById(R.id.drive_select_file_dialog_file_list_view);
        getActivity();
        lrd lrd = new lrd();
        this.r = lrd;
        this.n.setLayoutManager(lrd);
        this.n.c = this.o;
        low low = new low(this.h, this.i, this.q, getActivity());
        this.j = low;
        low.p = this.D;
        low.q = this.F;
        this.n.setAdapter(low);
        lqa lqa = new lqa();
        this.s = lqa;
        lqa.a = this.E;
        this.n.setHasFixedSize(true);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        low low = this.j;
        low.e();
        low.l.b(low);
        low.m.b((lpu) low);
        this.h.b(this);
        this.i.b((lpu) this);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.drive_menu_search) {
            if (this.g.i()) {
                this.h.a(new SearchPathElement(""));
            }
            return true;
        } else if (itemId == R.id.drive_menu_create_folder) {
            if (this.n.isEnabled()) {
                PathElement b2 = this.h.b();
                iva.a(b2 instanceof DriveIdPathElement);
                DriveId a2 = ((DriveIdPathElement) b2).a();
                lop lop = new lop();
                Bundle bundle = new Bundle();
                bundle.putParcelable("parentDriveId", a2);
                lop.setArguments(bundle);
                lop.show(getActivity().getSupportFragmentManager(), "SelectFileFragment");
            }
            return true;
        } else if (itemId == R.id.drive_menu_refresh) {
            this.m.a(true);
            this.j.d();
            return true;
        } else if (itemId == R.id.drive_menu_sort) {
            lqu c2 = this.h.b().c();
            lqs a3 = this.q.a(c2);
            lpx lpx = new lpx();
            Bundle bundle2 = new Bundle();
            bundle2.putString("sortType", c2.f);
            bundle2.putString("currentSortOption", a3.a());
            lpx.setArguments(bundle2);
            lpx.show(getFragmentManager(), "SortOptionDialogFragment");
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.g.i()) {
                this.k = null;
                this.h.a(this.g);
                if (this.h.b() == PathStack.b) {
                    this.m.a(false);
                }
            }
            return true;
        }
    }

    public final void onPause() {
        super.onPause();
        this.k = null;
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.t = this.u.e();
        }
    }

    public final void onResume() {
        super.onResume();
        lge lge = new lge(lsm.a(getActivity()), getActivity());
        Bundle bundle = this.t;
        if (bundle == null) {
            Bundle arguments = getArguments();
            String string = arguments.getString("callerPackageName");
            lfs a2 = lge.a(new CallingAppInfo(this.e, string, 0), arguments.getString("accountName"));
            this.u = a2;
            a2.a();
            lgc d2 = ((lgn) this.u).d();
            d2.j();
            d2.c(3, 31);
            d2.a();
            lgc d3 = ((lgn) this.u).d();
            d3.i();
            d3.c(3, 55);
            this.k = d3;
            return;
        }
        this.u = lge.a(bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pathStack", this.h);
        bundle.putParcelable("selection", this.i);
        bundle.putParcelable("preferences", this.q);
        bundle.putBundle("logSessionState", this.t);
    }

    public final void onStop() {
        super.onStop();
        d();
        b();
    }

    private final void a(boolean z2) {
        int i2;
        int i3;
        if (!z2) {
            i2 = R.dimen.drive_ActionBar_SecondaryTextSize;
        } else {
            i2 = R.dimen.drive_ActionBar_PrimaryTextSize;
        }
        this.l.b(!z2);
        View a2 = this.l.a();
        int i4 = 0;
        if (!z2) {
            i3 = getResources().getDimensionPixelOffset(R.dimen.drive_Space_2);
        } else {
            i3 = 0;
        }
        a2.setPaddingRelative(i3, 0, 0, 0);
        this.v.setTextSize(0, (float) getResources().getDimensionPixelSize(i2));
        if (z2) {
            this.v.requestFocus();
        }
        TextView textView = this.w;
        if (z2) {
            i4 = 8;
        }
        textView.setVisibility(i4);
    }

    public final void a() {
        if (this.h.b() != PathStack.b && this.j.h && this.r.n() == this.j.a() - 1) {
            low low = this.j;
            if (low.o.a()) {
                low.a.b("A sync more is already in progress; not requesting another one");
            } else if (ljg.a(low.g)) {
                low.a.b("Query is full text search, aborting sync more");
            } else {
                low.a.b("Requesting sync more");
                lpc lpc = low.o;
                Query query = low.g;
                icc icc = low.j;
                kvf kvf = (kvf) icc.a(jzf.f);
                iva.b(!ljg.a(query), "Cannot sync more with full text search");
                lpc.a(icc.b((idf) new kva(icc, query)), new lov(low));
            }
        }
    }

    public final void a(int i2) {
        lfs lfs = this.u;
        if (lfs != null) {
            lgn lgn = (lgn) lfs;
            if (!lgn.c) {
                lgc d2 = lgn.d();
                d2.c(3, 29);
                d2.e(i2);
                d2.j();
                if (i2 == 0) {
                    d2.a(this.i.d);
                }
                d2.a();
                this.u.b();
                this.u = null;
                return;
            }
        }
        a.b("SelectFileFragment", "Log session has ended or is paused in finalizeLogging()");
    }

    public final void a(int i2, DriveId driveId) {
        if (i2 == 0 && driveId != null) {
            driveId.b().a(this.g).a(this.p);
        }
    }

    public final void a(DriveId driveId) {
        Activity activity = getActivity();
        Intent intent = new Intent("android.intent.action.PICK");
        intent.putExtra("response_drive_id", driveId);
        activity.setResult(-1, intent);
        a(0);
        activity.finish();
    }

    public final void a(PathElement pathElement) {
        if (pathElement == PathStack.b) {
            a(true);
            this.j.e();
            e();
            this.n.setAdapter(this.s);
        } else {
            this.n.setEnabled(false);
            this.l.p();
            a(false);
            if (pathElement instanceof SearchPathElement) {
                a(((SearchPathElement) pathElement).a);
            } else {
                e();
                String a2 = pathElement.a(getActivity());
                boolean z2 = pathElement instanceof ViewPathElement;
                this.w.setText(a2);
                if (!z2) {
                    String valueOf = String.valueOf(a2);
                    String string = getString(R.string.drive_folder);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
                    sb.append(valueOf);
                    sb.append(" ");
                    sb.append(string);
                    a2 = sb.toString();
                }
                this.w.setContentDescription(getString(R.string.drive_doclist_title_description, a2));
                this.w.clearFocus();
                this.w.requestFocus();
            }
            this.m.postDelayed(this.b, 300);
        }
        Selection selection = this.i;
        selection.c = null;
        selection.d = null;
        selection.a();
        f();
        g();
        d();
    }

    public final void a(lqu lqu, lqs lqs) {
        this.q.a(lqu, lqs);
        this.j.a(lqu, lqs);
    }
}
