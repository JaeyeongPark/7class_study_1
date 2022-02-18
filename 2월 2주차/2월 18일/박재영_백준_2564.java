package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2564_경비원3 {
	static int clen;
	static int rlen;
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		clen = Integer.parseInt(st.nextToken());
		rlen = Integer.parseInt(st.nextToken());
		ans = 0;
		int dist = 0;
		int N = Integer.parseInt(br.readLine());
		int[] dir = new int[N];
		int[] pos = new int[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			dir[i] = Integer.parseInt(st.nextToken());
			pos[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int dongdir = Integer.parseInt(st.nextToken());
		int dongpos = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			switch (dongdir) {
			case 1:
				dist = north(dongpos,dongdir,dir[i],pos[i]);
				break;
			case 2:
				dist = south(dongpos,dongdir,dir[i],pos[i]);
				break;
			case 3:
				dist = west(dongpos,dongdir,dir[i],pos[i]);
				break;
			case 4:
				dist = east(dongpos,dongdir,dir[i],pos[i]);
				break;
			}
			
			ans += dist;
		}
		
		System.out.println(ans);
	}


	private static int north(int dongpos, int dongdir, int dir, int pos) {
		// TODO Auto-generated method stub
		int dist = 0;
		switch (dir) {
		case 1:
			dist = Math.abs(pos-dongpos);
			break;
		case 2:
			dist = Math.min(rlen+pos+dongpos,rlen +(clen-pos)+(clen-dongpos));
			break;
		case 3:
			dist = pos+dongpos;
			break;
		case 4:
			dist = (clen-dongpos)+pos;
			break;
		}
		return dist;
		
	}
	
	
	private static int south(int dongpos, int dongdir, int dir, int pos) {
		int dist = 0;
		switch (dir) {
		case 1:
			dist = Math.min(rlen+pos+dongpos,rlen +(clen-pos)+(clen-dongpos));
			break;
		case 2:
			dist = Math.abs(pos-dongpos);
			break;
		case 3:
			dist = (rlen-pos)+dongpos;
			break;
		case 4:
			dist = (rlen-pos)+(clen-dongpos);
			break;
		}
		return dist;
	}
	
	private static int west(int dongpos, int dongdir, int dir, int pos) {
		int dist = 0;
		switch (dir) {
		case 1:
			dist = dongpos + pos;
			break;
		case 2:
			dist = (rlen-dongpos)+pos;
			break;
		case 3:
			dist = Math.abs(pos-dongpos);
			
			break;
		case 4:
			dist = Math.min(clen+pos+dongpos,clen+(rlen-pos)+(rlen-dongpos));
			break;
		}
		return dist;
	}
	
	private static int east(int dongpos, int dongdir, int dir, int pos) {
		int dist = 0;
		switch (dir) {
		case 1:
			dist =  (clen-pos)+dongpos;
			break;
		case 2:
			dist =(clen-pos) +(rlen-dongpos);
			break;
		case 3:
			dist = Math.min(pos+dongpos+clen,clen+(rlen-pos)+(rlen-dongpos));
			break;
		case 4:
			dist = Math.abs(pos-dongpos);
			break;
		}
		return dist;
	}
	
	

}
