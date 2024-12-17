package ma.emsi.devoir_surveille_book.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
    private String titre;
    private String publisher;
    private LocalDate datePublication;
    private Double price;
    private String resume;
}
