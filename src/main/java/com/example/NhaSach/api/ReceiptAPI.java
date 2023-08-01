package com.example.NhaSach.api;

import com.example.NhaSach.converter.ReceiptConverter;
import com.example.NhaSach.dto.Receipt.ReceiptForPostDTO;
import com.example.NhaSach.dto.Receipt.ReceiptStaticDTO;
import com.example.NhaSach.entity.ReceiptEntity;
import com.example.NhaSach.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class ReceiptAPI {
    @Autowired
    private ReceiptService receiptService;

    @Autowired
    private ReceiptConverter receiptConverter;

    @PostMapping("/receipts")
    public ReceiptForPostDTO createReceipt(@RequestBody ReceiptForPostDTO receipt){
        ReceiptEntity receiptEntity = receiptConverter.toReceiptEntity(receipt);
        receiptEntity = receiptService.create(receiptEntity);
        return receiptConverter.toReceiptForPostDTO(receiptEntity);
    }

    @PutMapping("/receipts")
    public ReceiptForPostDTO updateReceipt(@RequestBody ReceiptForPostDTO receipt){
        ReceiptEntity receiptEntity = receiptConverter.toReceiptEntity(receipt);
        receiptEntity = receiptService.create(receiptEntity);
        return receiptConverter.toReceiptForPostDTO(receiptEntity);
    }

    @GetMapping("/receipts")
    public Page<ReceiptForPostDTO> createReceipt(
            @RequestParam Optional<String> sort,
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<Integer> limit
    ){
        String sortBy = sort.orElse("All");
        if(sortBy.equals("All")){
            receiptConverter.toPageObjectDto(receiptService.showAllPaginated(page.orElse(1), 3));
        }
        return receiptConverter.toPageObjectDto(receiptService.showAllPaginated(page.orElse(1), 3));
    }
}
