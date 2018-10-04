package com.gms.web.brd;

import java.util.List;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import com.gms.web.mbr.Member;

import lombok.Data;

@Data
@Component
@Lazy
public class Attach {
	private String seq;
	private String name;
	private String title;
	private String content;
	private String writer;
	private String regdate;
}
